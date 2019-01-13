package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A126971.
 * @author Sean A. Irvine
 */
public class A126971 implements Sequence {

  private LongDynamicByteArray mCurrent = new LongDynamicByteArray();

  @Override
  public Z next() {
    if (mCurrent.length() == 0) {
      mCurrent.set(0, (byte) 1);
    } else {
      final LongDynamicByteArray nextRow = new LongDynamicByteArray();
      nextRow.set(0, mCurrent.get(mCurrent.length() - 1));
      for (long k = 0; k < mCurrent.length(); ++k) {
        final int sum = mCurrent.get(k) + nextRow.get(k);
        if (sum < 10) {
          nextRow.set(nextRow.length(), (byte) sum);
        } else {
          nextRow.set(nextRow.length(), (byte) (sum / 10));
          nextRow.set(nextRow.length(), (byte) (sum % 10));
        }
      }
      mCurrent = nextRow;
    }
    return Z.valueOf(mCurrent.get(0));
  }
}

