package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a006.A006562;
import irvine.util.array.DynamicArray;

/**
 * A054342 First occurrence of distances of equidistant lonely primes. Each equidistant prime is at the same distance (or has the same gap) from the preceding prime and the next prime.
 * @author Sean A. Irvine
 */
public class A054342 extends A006562 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      super.next(); // handle 5
      return Z.FIVE;
    }
    while (mA.get(mN) == null) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final int delta = q.subtract(p).intValueExact();
      if (delta % 6 == 0) {
        final int d = delta / 6;
        if (mA.get(d) == null) {
          mA.set(d, p);
        }
      }
    }
    return mA.get(mN);
  }
}
