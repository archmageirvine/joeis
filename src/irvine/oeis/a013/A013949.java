package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A013949.
 * @author Sean A. Irvine
 */
public class A013949 implements Sequence {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mD = 1;
  protected long mN = -1;

  @Override
  public Z next() {
    if (++mN >= mD) {
      long j = 0;
      for (long k = 0; k < mD; ++k) {
        if (mA.isSet(k)) {
          mA.set(j++);
          if (++k != mD) {
            ++j;
          }
        } else {
          mA.set(++j);
          ++j;
        }
      }
      mD = j;
    }
    return mA.isSet(mN) ? Z.TWO : Z.ONE;
  }
}
