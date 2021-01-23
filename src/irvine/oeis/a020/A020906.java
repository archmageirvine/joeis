package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A020906 Triangle where n-th row is the first n terms of the sequence in reverse order, starting with a(1) = 1 and a(2) = 2.
 * @author Sean A. Irvine
 */
public class A020906 implements Sequence {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mN = -1;
  private long mLen = 3;
  private long mR = 2;
  {
    mA.set(1);
  }

  @Override
  public Z next() {
    if (++mN >= mLen) {
      ++mR;
      for (long k = mLen, j = mR - 1; k <= mLen + mR; ++k, --j) {
        if (mA.isSet(j)) {
          mA.set(k);
        }
      }
      mLen += mR;
    }
    return mA.isSet(mN) ? Z.TWO : Z.ONE;
  }
}
