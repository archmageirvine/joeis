package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;

/**
 * A001453 Catalan numbers - 1.
 * @author Sean A. Irvine
 */
public class A001453 extends Sequence2 implements DirectSequence {

  private int mN = 1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.CATALAN.z(n).subtract(1);
  }

  @Override
  public Z a(final int n) {
    return Functions.CATALAN.z(n).subtract(1);
  }

}
