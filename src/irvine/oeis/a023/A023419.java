package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A023419.
 * @author Sean A. Irvine
 */
public class A023419 implements Sequence {

  private final TreeSet<Long> mA = new TreeSet<>();
  private final LongDynamicLongArray mC = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = a();

  protected long a() {
    return 1;
  }

  protected long b() {
    return 2;
  }

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
        mA.add(a());
        return Z.valueOf(a());
      } else {
        mA.add(b());
        return Z.valueOf(b());
      }
    }
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add(get(mN / k - 1));
    }
    mA.add(sum.longValueExact());
    return sum;
  }
}
