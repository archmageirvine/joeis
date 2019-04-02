package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007882 Number of lattice points inside circle of radius n is 4(a(n)+n)-3.
 * @author Sean A. Irvine
 */
public class A007882 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    final long t = mN * mN - 1;
    for (long x = 1; x * x < t; ++x) {
      final long y2 = t - x * x;
      final long s = LongUtils.sqrt(y2);
      count += s;
    }
    return Z.valueOf(count);
  }
}
