package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069861 Numbers n that divide the concatenation of next n numbers.
 * @author Sean A. Irvine
 */
public class A069861 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final StringBuilder sb = new StringBuilder();
    for (long k = 1; k <= n; ++k) {
      sb.append(n + k);
    }
    return new Z(sb).mod(n) == 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

