package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001092 Union of all numbers {p, q} where p and q are both primes or powers of primes and q = p+2.
 * @author Sean A. Irvine
 */
public class A001092 extends Sequence1 {

  private Z mN = Z.ZERO;

  private boolean isPrimePower(final Z z) {
    if (z.isPrime()) {
      return true;
    }
    final Z p = z.isPower();
    return p != null && p.isPrime() || Z.ONE.equals(z);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isPrimePower(mN) && (isPrimePower(mN.add(2)) || isPrimePower(mN.subtract(2)))) {
        return mN;
      }
    }
  }
}

