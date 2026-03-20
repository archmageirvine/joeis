package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005282;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A394212 Difference set of Mian-Chowla sequence in order of appearance.
 * @author Sean A. Irvine
 */
public class A394212 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final A005282 mMianChowla = new A005282();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        mMianChowla.a(++mN).longValueExact(); // will exception if too large
        mM = 0;
      }
      final long d = mMianChowla.a(mN).longValue() - mMianChowla.a(mM).longValue();
      if (!mSeen.isSet(d)) {
        mSeen.set(d);
        return Z.valueOf(d);
      }
    }
  }
}
