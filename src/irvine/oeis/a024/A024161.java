package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024161 Number of integer-sided triangles with sides a,b,c, a &lt; b &lt; c, a+b+c = n such that a,b,c are pairwise relatively prime.
 * @author Sean A. Irvine
 */
public class A024161 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = a + 1; b < mN - a; ++b) {
        if (Functions.GCD.l(a, b) == 1) {
          final long c = mN - a - b;
          if (c > b && a + b > c && Functions.GCD.l(a, c) == 1 && Functions.GCD.l(b, c) == 1) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
