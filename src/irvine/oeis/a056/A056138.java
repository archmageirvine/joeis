package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056138 Number of ways in which n can be the shorter leg (shortest side) of an integer-sided right-angled triangle.
 * @author Sean A. Irvine
 */
public class A056138 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long c = mN + 2; c <= mN * mN / 2 + 1; ++c) {
      final long b2 = c * c - mN * mN;
      final long b = LongUtils.sqrt(b2);
      if (b * b == b2 && mN < b) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
