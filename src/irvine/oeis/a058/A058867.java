package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a006.A006562;

/**
 * A058867 Equidistant lonely primes. Each prime is the same distance (gap) from the preceding prime and the next prime. These distances are maximal: each distance is larger than all such previous distances.
 * @author Sean A. Irvine
 */
public class A058867 extends A006562 {

  private int mDelta = -1;

  @Override
  public Z next() {
    if (mDelta == -1) {
      super.next(); // handle 5
      mDelta = 0;
      return Z.FIVE;
    }
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final int delta = q.subtract(p).intValueExact();
      if (delta % 6 == 0) {
        final int d = delta / 6;
        if (d > mDelta) {
          mDelta = d;
          return p;
        }
      }
    }
  }
}
