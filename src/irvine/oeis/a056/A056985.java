package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056985 Primes p which do not divide Sum_{i=1..m} i! for any m (see A125138).
 * @author Sean A. Irvine
 */
public class A056985 extends A056983 {

  private long mP = 1;

  @Override
  public Z next() {
    outer:
    while (true) {
      mP = mPrime.nextPrime(mP);
      for (int k = 1; k <= mP; ++k) {
        if (get(k).mod(mP) == 0) {
          continue outer;
        }
      }
      return Z.valueOf(mP);
    }
  }
}
