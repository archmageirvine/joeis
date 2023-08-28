package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065311 Primes which occur exactly twice in the sequence of a(n) = prime(n) - prime(n - pi(n)) = A065308(n).
 * @author Sean A. Irvine
 */
public class A065311 extends A065308 {

  private Z mB = Z.ZERO;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.isOdd() && t.equals(mA)) {
        if (t.equals(mB)) {
          throw new UnsupportedOperationException("Unexpected " + t + " occurred more than twice");
        }
        mB = t;
        return mA;
      } else {
        mB = t;
      }
    }
  }
}
