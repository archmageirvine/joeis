package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083747.
 * @author Sean A. Irvine
 */
public class A083755 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
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
          return mA;
        }
      }
    }
  }
}
