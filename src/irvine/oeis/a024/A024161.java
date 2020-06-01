package irvine.oeis.a024;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024161 Number of integer-sided triangles with sides a,b,c, a <code>&lt; b &lt;</code> c, <code>a+b+c = n</code> such that a,b,c are pairwise relatively prime.
 * @author Sean A. Irvine
 */
public class A024161 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = a + 1; b < mN - a; ++b) {
        if (LongUtils.gcd(a, b) == 1) {
          final long c = mN - a - b;
          if (c > b && a + b > c && LongUtils.gcd(a, c) == 1 && LongUtils.gcd(b, c) == 1) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
