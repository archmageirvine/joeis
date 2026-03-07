package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A084035 a(1) = 1 and then distinct numbers such that the sum as well the absolute difference of successive terms is a prime.
 * @author Sean A. Irvine
 */
public class A084035 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (mUsed.isSet(mLeastUnused)) {
        ++mLeastUnused;
      }
      long k = mLeastUnused;
      while (true) {
        if (!mUsed.isSet(k) && mA.add(k).isProbablePrime() && mA.subtract(k).abs().isProbablePrime()) {
          mUsed.set(k);
          mA = Z.valueOf(k);
          break;
        }
        ++k;
      }
    }
    return mA;
  }
}

