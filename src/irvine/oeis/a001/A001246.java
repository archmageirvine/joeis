package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000108;

/**
 * A001246 Squares of Catalan numbers.
 * @author Sean A. Irvine
 */
public class A001246 extends A000108 implements DirectSequence {

  @Override
  public Z next() {
    return super.next().square();
  }

  @Override
  public Z a(final Z n) {
    return Functions.CATALAN.z(n).square();
  }

  @Override
  public Z a(final int n) {
    return Functions.CATALAN.z(n).square();
  }
}
