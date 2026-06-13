package irvine.oeis.a395;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395186 a(n) is the number of pairwise incongruent triangles with distinct integer sides and positive integer area and longest side of length n.
 * @author Sean A. Irvine
 */
public class A395186 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long y = mN / 2 + 1; y < mN; ++y) {
      final long m = Math.max(1, mN - y + 1);
      final long k = (m & 1) == ((mN - y) & 1) ? m : m + 1;
      final long i = mN + y;
      final long j = mN - y;
      for (long x = k; x < y; x += 2) {
        if (Predicates.SQUARE.is(((x + i) / 2) * ((i - x) / 2) * ((x + j) / 2) * ((x - j) / 2))) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
