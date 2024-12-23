package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073894 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mA = mA.multiply(10);
    long k = -1;
    long m = 10;
    while (true) {
      if (++k == m) {
        m *= 10;
        mA = mA.multiply(10);
      }
      if (!mUsed.isSet(k)) {
        final Z t = mA.add(k);
        if (t.mod(mN) == 0) {
          mA = t;
          mUsed.set(k);
          return Z.valueOf(k);
        }
      }
    }
  }
}

