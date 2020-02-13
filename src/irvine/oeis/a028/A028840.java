package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A028840 Numbers n such that sum of digits of n is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A028840 extends A000045 {

  private final TreeSet<Long> mFibo = new TreeSet<>();
  private long mN = -1;
  {
    mFibo.add(0L);
  }

  @Override
  public Z next() {
    while (true) {
      final long u = ZUtils.digitSum(++mN);
      while (u > mFibo.last()) {
        mFibo.add(super.next().longValueExact());
      }
      if (mFibo.contains(u)) {
        return Z.valueOf(mN);
      }
    }
  }
}
