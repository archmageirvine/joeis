package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082185 Triangle read by rows: n-th row contains concatenations of nonempty subsets of {1, 2, ..., n}, ordered first by size and then lexicographically.
 * @author Sean A. Irvine
 */
public class A082185 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mM > mN) {
        ++mN;
        mM = 1;
      }
      for (long r = (1L << mM) - 1; r < 1L << mN; r = Functions.SWIZZLE.l(r)) {
        long s = r;
        int k = 1;
        final StringBuilder sb = new StringBuilder();
        while (s != 0) {
          if ((s & 1) == 1) {
            sb.append(k);
          }
          s >>>= 1;
          ++k;
        }
        mA.add(new Z(sb));
      }
    }
    return mA.pollFirst();
  }
}
