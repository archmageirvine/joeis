package irvine.oeis.a323;

import irvine.math.z.Z;
import irvine.oeis.a049.A049820;

/**
 * A323158 If n is a square, a(n) = 1-(n mod 2), otherwise a(n) = (n mod 2); a(n) = A049820(n) mod 2, where A049820(n) = n - number of divisors of n.
 * @author Georg Fischer
 */
public class A323158 extends A049820 {

  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}
