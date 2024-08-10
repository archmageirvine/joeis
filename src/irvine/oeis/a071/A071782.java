package irvine.oeis.a071;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071779.
 * @author Sean A. Irvine
 */
public class A071782 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> set = new HashSet<>();
    for (long k = 1; k < mN; ++k) {
      set.add((k * k) % mN);
    }
    long sum = 0;
    for (final long v : set) {
      sum += v;
      sum %= mN;
    }
    return Z.valueOf(sum);
  }
}
