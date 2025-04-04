package irvine.oeis.a382;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A382482 allocated for Sameer Khan.
 * @author Sean A. Irvine
 */
public class A382482 extends Sequence1 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private long mN = 0;
  private long mM = 0;
  private long mLeastUndefined = 1;
  private long mLeastUnused = 1;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      if (mM == 0) {
        mM = 1;
        mA.set(1, 1);
        mUsed.add(1L);
      } else if (mLeastUndefined < mM) {
        final long v = mA.get(mM) - (mM - mLeastUndefined);
        mA.set(mLeastUndefined, v);
        mM = mLeastUndefined;
        if (v <= mLeastUnused) {
          mUsed.add(v);
        }
      } else {
        mM += mA.get(mM);
        while (mA.get(mM) != 0) {
          ++mM;
        }
        mA.set(mM, mLeastUnused);
        mUsed.add(mLeastUnused);
      }
      while (mA.get(mLeastUndefined) != 0) {
        ++mLeastUndefined;
      }
      while (mUsed.remove(mLeastUnused)) {
        ++mLeastUnused;
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
