package irvine.oeis.a349;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A349127 Möbius transform of A064989, where A064989 is multiplicative with a(2^e) = 1 and a(p^e) = prevprime(p)^e for odd primes p.
 * @author Georg Fischer
 */
public class A349127 extends Sequence1 {

  /**
   * Direct access with int parameter.
   * @param n index
   * @return function value
   */
  public static Z a(final int n) {
    return getProduct(Jaguar.factor(n));
  }

  /**
   * Direct access with Z parameter.
   * @param n index
   * @return function value
   */
  public static Z a(final Z nz) {
    return getProduct(Jaguar.factor(nz));
  }

  /**
   * Compute the new term.
   * @param fs FactorSequence
   * @return product with modified primes
   */
  private static Z getProduct(final FactorSequence fs) {
    final Fast mPrime = new Fast();
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = p.equals(Z.TWO) ? Z.ONE : mPrime.prevPrime(p);
      prod = prod.multiply(q.pow(fs.getExponent(p) - 1).multiply(q.subtract(1)));
    }
    return prod;
  }

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = p.equals(Z.TWO) ? Z.ONE : mPrime.prevPrime(p);
      prod = prod.multiply(q.pow(fs.getExponent(p) - 1).multiply(q.subtract(1)));
    }
    return prod;
  }
}
