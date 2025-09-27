package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A033885 a(n) = 3*n - sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A033885 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(3).subtract(Functions.SIGMA1.z(n));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n * 3).subtract(Functions.SIGMA1.z(n));
  }

}
