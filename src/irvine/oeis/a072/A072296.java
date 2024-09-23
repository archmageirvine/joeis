package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a063.A063740;
import irvine.util.array.DynamicLongArray;

/**
 * A072296 Least number starting a chain of exactly n consecutive even integers that do not have cototient-inverses.
 * @author Sean A. Irvine
 */
public class A072296 extends Sequence1 {

  private final Sequence mCototientCounts = new A063740();
  private final DynamicLongArray mA = new DynamicLongArray();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      mM += 2;
      final long start = mM;
      Z u = mCototientCounts.next();
      mCototientCounts.next(); // odd term
      int cnt = 0;
      while (u.isZero()) {
        ++cnt;
        mM += 2;
        u = mCototientCounts.next();
        mCototientCounts.next(); // odd term
      }
      if (mA.get(cnt) == 0) {
        mA.set(cnt, start);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

