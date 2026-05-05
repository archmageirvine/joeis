package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A084710 Beginning with 2 the smallest prime greater than the previous term such that the difference of successive terms is a distinct square.
 * @author Sean A. Irvine
 */
public class A084710 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    long k = 0;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final Z t = mA.add(k * k);
        if (t.isProbablePrime()) {
          mA = t;
          mUsed.set(k);
          return mA;
        }
      }
    }
  }
}
