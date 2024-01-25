package irvine.oeis.a068;

import java.util.Arrays;

import irvine.math.partitions.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence2;
import irvine.util.Permutation;
import irvine.util.string.StringUtils;

/**
 * A068072.
 * @author Sean A. Irvine
 */
public class A068072 extends Sequence2 implements Conjectural {

  private static final int HEURISTIC = 5;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mBase = 1;
  protected int mLast = 1;

  @Override
  public Z next() {
    ++mBase;
    long cnt = -1;
    for (int d = 1; d < mLast + HEURISTIC; ++d) {
      final FixedLengthPartition part = new FixedLengthPartition(d, mBase, 0, d);
      int[] p;
      while ((p = part.next()) != null) {
        final Permutation perm = new Permutation(p);
        int[] c;
        while ((c = perm.next()) != null) {
          Z x = Z.ZERO;
          for (int k = 0; k < c.length; ++k) {
            x = x.add(Z.valueOf(k).pow(d).multiply(c[k]));
          }
          final int[] xc = ZUtils.digitCounts(x, mBase);
          if (Arrays.equals(xc, c)) {
            ++cnt;
            if (d > mLast) {
              mLast = d;
            }
            if (mVerbose) {
              StringUtils.message("Success: " + Arrays.toString(c));
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
