package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A071386.
 * @author Sean A. Irvine
 */
public class A071415 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    for (long a = 0; a <= mN; ++a) {
      for (long c = 0; a + c <= mN; ++c) {
        mSeen.set(a * mN + c);
      }
      for (long b = 0; b <= mN; ++b) {
        mSeen.set(a * b + mN - b);
      }
    }
    while (mSeen.isSet(mM)) {
      ++mM;
    }
    return Z.valueOf(mM - 1);
  }
}
