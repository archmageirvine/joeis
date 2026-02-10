package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083747.
 * @author Sean A. Irvine
 */
public class A083754 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    mA = mA.multiply(10);
    long lim = 10;
    long k = 1;
    while (true) {
      k += 2;
      if (k > lim) {
        mA = mA.multiply(10);
        lim *= 10;
      }
      if (k % 5 != 0 && !mUsed.isSet(k)) {
        final Z u = mA.add(k);
        if (u.isProbablePrime()) {
          mUsed.set(k);
          mA = u;
          return Z.valueOf(k);
        }
      }
    }
  }
}
