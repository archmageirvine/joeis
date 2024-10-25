package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A072758 a(0)=0, a(1)=1 and for k&gt;1, a(2k)=least positive integer not a(j) for j&lt;2k; and a(2k+1)=a(2k)+Floor(a(2k)/2).
 * @author Sean A. Irvine
 */
public class A072758 extends Sequence0 {

  private final LongDynamicBooleanArray mForbidden = new LongDynamicBooleanArray();
  private long mM = 1;
  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      mForbidden.set(1);
      return Z.ZERO;
    }
    if (mM > 0) {
      final long r = mM;
      mM = 0;
      return Z.valueOf(r);
    }
    while (mForbidden.isSet(++mN)) {
      // do nothing
    }
    mM = mN + mN / 2;
    mForbidden.set(mM);
    return Z.valueOf(mN);
  }
}
