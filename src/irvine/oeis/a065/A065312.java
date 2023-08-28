package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065312 Primes which occur exactly once in A065308 (prime(n - pi(n))).
 * @author Sean A. Irvine
 */
public class A065312 extends A065308 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (!t.equals(mA) && !mA.equals(mB)) {
        return mA;
      }
    }
  }
}
