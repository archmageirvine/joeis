package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a006.A006562;

/**
 * A058868 Maximal distances of equidistant lonely primes shown in A058867.
 * @author Sean A. Irvine
 */
public class A058868 extends A006562 {

  /** Construct the sequence. */
  public A058868() {
    super(0);
  }

  private int mDelta = -1;

  @Override
  public Z next() {
    if (mDelta == -1) {
      super.next(); // handle 5
      mDelta = 0;
      return Z.TWO;
    }
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final int delta = q.subtract(p).intValueExact();
      if (delta % 6 == 0) {
        final int d = delta / 6;
        if (d > mDelta) {
          mDelta = d;
          return Z.valueOf(delta);
        }
      }
    }
  }
}
