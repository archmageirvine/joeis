package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A055456 a(n) is the smallest number which is not the sum of exactly 1 or of n earlier terms.
 * @author Sean A. Irvine
 */
public class A055456 implements Sequence {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    final long t = mN++ > 0 && !mSeen.isSet(mN - 1) ? mN - 1 : mN * mN - mN + 1;
    mSeen.set(t);
    return Z.valueOf(t);
  }
}
