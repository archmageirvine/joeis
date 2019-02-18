package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;
import irvine.util.array.DynamicLongArray;

/**
 * A018899.
 * @author Sean A. Irvine
 */
public class A018899 extends A003586 {

  private final DynamicLongArray mA = new DynamicLongArray();
  {
    mA.set(0, super.next().longValueExact());
  }
  private long mN = -1;
  private long mM = 0;

  private boolean isRepresentable(final long m, final int start, final int k) {
    if (k == mN) {
      return false;
    }
    for (int j = start; j < mA.length(); ++j) {
      final long v = m - mA.get(j);
      if (v < 0) {
        break;
      }
      if (isRepresentable(v, j + 1, k + 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (++mM >= mA.get(mA.length() - 1)) {
        mA.set(mA.length(), super.next().longValueExact());
      }
      if (!isRepresentable(mM, 0, 0)) {
        return Z.valueOf(mM);
      }
    }
  }

}

