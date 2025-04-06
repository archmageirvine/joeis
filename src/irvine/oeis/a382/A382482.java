package irvine.oeis.a382;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A382482 a(1) = 1. Let a(n) be the most recently defined term. At each step, check for an undefined term with index &lt; n. If such a term exists, then where i is the earliest such index, set a(i) = a(n) - (n - i). If no such term exists, then where i is the first undefined index &gt;= n + a(n), set a(i) = the smallest integer not yet used.
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
