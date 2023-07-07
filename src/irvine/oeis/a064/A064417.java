package irvine.oeis.a064;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064417 a(1) = 1, a(2) = 2, a(3) = 3; for n &gt;3 a(n) = smallest number not already used such that gcd(a(n), a(n-1)) &gt;= 3.
 * @author Sean A. Irvine
 */
public class A064417 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mA = 0;
  private final long mRunUp;

  protected A064417(final long runUp) {
    mRunUp = runUp;
  }

  /** Construct the sequence. */
  public A064417() {
    this(3);
  }

  @Override
  public Z next() {
    if (mA < mRunUp) {
      ++mA;
    } else {
      long k = mRunUp;
      while (true) {
        if (!mSeen.isSet(++k) && LongUtils.gcd(mA, k) >= mRunUp) {
          mA = k;
          break;
        }
      }
    }
    mSeen.set(mA);
    return Z.valueOf(mA);
  }
}
