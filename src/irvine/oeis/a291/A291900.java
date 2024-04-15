package irvine.oeis.a291;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A291900 Sum of the divisors of 24*n - 1, divided by 24, minus n.
 * @author Georg Fischer
 */
public class A291900 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.SIGMA.z(24L * mN - 1).divide(24).subtract(mN);
  }
}
