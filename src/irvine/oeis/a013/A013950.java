package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A013950.
 * @author Sean A. Irvine
 */
public class A013950 implements Sequence {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mD = 0;

  @Override
  public Z next() {
    if (mD == 0) {
      mD = 1;
      return Z.ONE;
    }
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
    return Z.valueOf(mD);
  }
}
