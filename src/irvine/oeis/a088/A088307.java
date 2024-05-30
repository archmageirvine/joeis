package irvine.oeis.a088;
// manually tresimple at 2023-07-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A088307 Triangle, read by rows, T(n,k) = n^2 + k^2 if gcd(n,k)=1, otherwise 0.
 * @author Georg Fischer
 */
public class A088307 extends Triangle {

  /** Construct the sequence. */
  public A088307() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return (n == 0) ? Z.TWO : Functions.GCD.l(n + 1, k + 1) == 1 ? Z.valueOf((n + 1L) * (n + 1) + (k + 1L) * (k + 1)) : Z.ZERO;
  }
}
