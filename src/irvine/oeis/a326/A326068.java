package irvine.oeis.a326;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a032.A032742;

/**
 * A326068 a(n) = n - sigma(A032742(n)), where sigma is the sum of divisors of n and A032742 gives the largest proper divisor of n.
 * @author Georg Fischer
 */
public class A326068 extends A032742 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(Functions.SIGMA1.z(super.next()));
  }
}
