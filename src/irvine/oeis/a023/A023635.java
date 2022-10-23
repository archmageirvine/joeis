package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A023635 a(n) = c([ 2n/3 ]) + n, with a(1) = 1, a(2) = 4, c = complement to a.
 * @author Sean A. Irvine
 */
public class A023635 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private final LongDynamicLongArray mC = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 1;

  private long get(final long n) {
    while (n >= mC.length()) {
      while (mA.contains(mM)) {
        ++mM;
      }
      mC.set(mC.length(), mM);
      ++mM;
    }
    return mC.get(n);
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      if (mN == 1) {
        mA.add(1L);
        return Z.ONE;
      } else {
        mA.add(4L);
        return Z.FOUR;
      }
    }
    final long res = get(2 * mN / 3 - 1) + mN;
    mA.add(res);
    return Z.valueOf(res);
  }
}
