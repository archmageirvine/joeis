package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A072756 a(n) = least nonnegative integer not a(k) and not a(k)+floor(a(k)/2) for k&lt;n.
 * @author Sean A. Irvine
 */
public class A072756 extends Sequence0 {

  private final LongDynamicBooleanArray mForbidden = new LongDynamicBooleanArray();
  private long mN = -1;

  @Override
  public Z next() {
    while (mForbidden.isSet(++mN)) {
      // do nothing
    }
    mForbidden.set(mN + mN / 2);
    return Z.valueOf(mN);
  }
}
