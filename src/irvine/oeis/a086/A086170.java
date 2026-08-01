package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A086170 a(1)=1; a(n)=a(n-1)+1 if n is in the sequence; a(n)=a(n-1)+2 if n and (n-1) are not in the sequence; a(n)=a(n-1)+3 if n is not in the sequence but (n-1) is in the sequence.
 * @author Sean A. Irvine
 */
public class A086170 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mUsed.set(1);
      mA = Z.ONE;
      return Z.ONE;
    }
    ++mN;
    if (mUsed.isSet(mN)) {
      mA = mA.add(1);
    } else if (!mUsed.isSet(mN) && !mUsed.isSet(mN - 1)) {
      mA = mA.add(2);
    } else {
      mA = mA.add(3);
    }
    mUsed.set(mA.longValueExact());
    return mA;
  }
}
