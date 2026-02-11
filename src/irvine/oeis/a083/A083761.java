package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083761 Primes arising in A083760.
 * @author Sean A. Irvine
 */
public class A083761 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mUsed.set(4);
      mA = Z.FOUR;
      return Z.valueOf(41);
    }
    mA = mA.multiply(10);
    long lim = 10;
    long k = 0;
    while (true) {
      k += 2;
      if (k >= lim) {
        mA = mA.multiply(10);
        lim *= 10;
      }
      if (!mUsed.isSet(k)) {
        final Z u = mA.add(k);
        final Z v = u.multiply(10).add(1);
        if (v.isProbablePrime()) {
          mUsed.set(k);
          mA = u;
          return v;
        }
      }
    }
  }
}
