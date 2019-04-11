package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002968 Number of pairings {(b[1],c[1]),(b[2],c[2]),...,(b[n],c[n])} of the first <code>2n</code> positive integers satisfying b[i] &lt; c[i] and such that the <code>2n</code> numbers c[i]+b[i] and c[i]-b[i] are all distinct.
 * @author Sean A. Irvine
 */
public class A002968 implements Sequence {

  private int mN = -1;

  private long count(final int remaining, final boolean[] used, final int start, final boolean[] seen) {
    if (remaining == 0) {
      return 1;
    }
    // Every integer must be used, so it is sufficient to locate the first unused value
    // when looking for candidates.
    long c = 0;
    int a = start;
    while (used[a]) {
      ++a;
    }
    //used[a] = true; // not really necessary
    for (int b = a + 1; b < used.length; ++b) {
      if (!used[b] && !seen[b - a] && !seen[b + a]) {
        used[b] = true;
        seen[b - a] = true;
        seen[b + a] = true;
        c += count(remaining - 1, used, a + 1, seen);
        seen[b + a] = false;
        seen[b - a] = false;
        used[b] = false;
      }
    }
    //used[a] = false; // not really necessary
    return c;
  }


  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(count(mN, new boolean[2 * mN + 1], 1, new boolean[4 * mN]));
  }
}
