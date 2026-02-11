package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083760 Rearrangement of even numbers such that concatenation of terms beginning with the first with a 1 as the least significant digit is a prime.
 * @author Sean A. Irvine
 */
public class A083760 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mUsed.set(4);
      mA = Z.FOUR;
      return mA;
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
        if (u.multiply(10).add(1).isProbablePrime()) {
          mUsed.set(k);
          mA = u;
          return Z.valueOf(k);
        }
      }
    }
  }
}
