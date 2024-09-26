package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A024816 Antisigma(n): Sum of the numbers less than n that do not divide n.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A024816 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    return Functions.ANTISIGMA.z(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
