package irvine.oeis.a060;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060292 At least two unordered triples of positive numbers have product n and equal sums.
 * @author Sean A. Irvine
 */
public class A060292 extends Sequence1 {

  private long mN = 35;

  @Override
  public Z next() {
    final HashSet<Long> seen = new HashSet<>();
    while (true) {
      ++mN;
      seen.clear();
      for (long a = 1; a <= mN; ++a) {
        if (mN % a == 0) {
          final long m = mN / a;
          for (long b = 1; b <= a && b <= m; ++b) {
            if (m % b == 0) {
              final long c = m / b;
              if (c <= b && !seen.add(a + b + c)) {
                return Z.valueOf(mN);
              }
            }
          }
        }
      }
    }
  }
}
