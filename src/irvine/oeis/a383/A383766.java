package irvine.oeis.a383;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383766 allocated for SiYang Hu.
 * @author Sean A. Irvine
 */
public class A383766 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Set<Long> ys = new HashSet<>();
    for (long y = 0; y < mN; ++y) {
      ys.add((y * y + 1) % mN);
    }
    final Set<Long> xs = new HashSet<>();
    for (long x = 0; x < mN; ++x) {
      xs.add((x * x * x + x) % mN);
    }
    long cnt = 0;
    for (final long k : ys) {
      if (xs.contains(k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

