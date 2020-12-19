package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037231 Primes which set a new record for length of Pratt certificate.
 * @author Sean A. Irvine
 */
public class A037231 extends A037202 {

  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(mBest) > 0) {
        mBest = t;
        return Z.valueOf(mP);
      }
    }
  }
}
