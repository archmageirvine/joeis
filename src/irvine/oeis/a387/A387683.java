package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A387683 a(0) = 0; thereafter a(n) = a(n-1) - n if a(n-1) &gt;= 2*n and not already in the sequence, otherwise a(n) = a(n-1) + n.
 * @author Sean A. Irvine
 */
public class A387683 extends Sequence0 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mA = 0;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mA >= 2 * mN && !mSeen.isSet(mA - mN)) {
        mA -= mN;
      } else {
        mA += mN;
      }
      mSeen.set(mA);
    }
    return Z.valueOf(mA);
  }
}
