package irvine.oeis.a395;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A395112 allocated for Robert P. P. McKone.
 * @author Sean A. Irvine
 */
public class A395112 extends Sequence1 {

  // Precomputed permutations of {0,1,2}
  private static final int[][] PERMS = {
    {0, 1, 2}, {0, 2, 1}, {1, 0, 2},
    {1, 2, 0}, {2, 0, 1}, {2, 1, 0}
  };

  private static final class IntTriple {
    private final int[] mT;

    IntTriple(final int[] v) {
      mT = v;
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mT);
    }

    @Override
    public boolean equals(final Object o) {
      return o instanceof IntTriple && Arrays.equals(mT, ((IntTriple) o).mT);
    }
  }

  private final HashSet<IntTriple> mSeen = new HashSet<>();
  private int mN = -1;

  private static int get(final int[] m, final int[] rp, final int[] cp, final boolean t, final int k) {
    final int i = k / 3;
    final int j = k % 3;
    return t ? m[cp[j] * 3 + rp[i]] : m[rp[i] * 3 + cp[j]];
  }

  // Canonical check without allocations
  private static boolean isCanonical(final int[] m) {
    for (final int[] rp : PERMS) {
      for (final int[] cp : PERMS) {
        for (int t = 0; t < 2; ++t) {
          boolean strictlyWorse = false;
          for (int k = 0; k < 9; ++k) {
            final int v = get(m, rp, cp, t == 1, k);
            final int b = m[k];
            if (v < b) {
              return false;
            } else if (v > b) {
              strictlyWorse = true;
              break;
            }
          }
          if (!strictlyWorse) {
            // equal, continue checking others
          }
        }
      }
    }
    return true;
  }

  // Compute SNF directly from linear array
  private static int[] snf(final int[] m) {
    // gcd of entries
    int d1 = 0;
    for (int v : m) {
      d1 = Functions.GCD.i(d1, v);
      if (d1 == 1) {
        break;
      }
    }

    // 2x2 minors (fully unrolled)
    int g2 = m[0] * m[4] - m[1] * m[3];
    g2 = Functions.GCD.i(g2, (long) m[0] * m[5] - (long) m[2] * m[3]);
    g2 = Functions.GCD.i(g2, (long) m[1] * m[5] - (long) m[2] * m[4]);
    g2 = Functions.GCD.i(g2, (long) m[0] * m[7] - (long) m[1] * m[6]);
    g2 = Functions.GCD.i(g2, (long) m[0] * m[8] - (long) m[2] * m[6]);
    g2 = Functions.GCD.i(g2, (long) m[1] * m[8] - (long) m[2] * m[7]);
    g2 = Functions.GCD.i(g2, (long) m[3] * m[7] - (long) m[4] * m[6]);
    g2 = Functions.GCD.i(g2, (long) m[3] * m[8] - (long) m[5] * m[6]);
    g2 = Functions.GCD.i(g2, (long) m[4] * m[8] - (long) m[5] * m[7]);

    final int d2 = (d1 == 0) ? 0 : g2 / d1;

    // determinant (unrolled)
    final int det =
      m[0] * (m[4] * m[8] - m[5] * m[7])
        - m[1] * (m[3] * m[8] - m[5] * m[6])
        + m[2] * (m[3] * m[7] - m[4] * m[6]);

    final int absDet = Math.abs(det);
    final int d3 = (d1 == 0 || d2 == 0) ? 0 : absDet / (d1 * d2);
    return new int[] {Math.abs(d1), Math.abs(d2), Math.abs(d3)};
  }

  @Override
  public Z next() {
    ++mN;

    final Bumper bump = BumperFactory.range(0, mN);
    final int[] m = new int[9];

    do {
      // must contain at least one n
      boolean hasN = false;
      for (int v : m) {
        if (v == mN) {
          hasN = true;
          break;
        }
      }
      if (!hasN) {
        continue;
      }

      // cheap partial ordering
      if (m[1] < m[0] || m[2] < m[1] || m[3] < m[0] || m[6] < m[3]) {
        continue;
      }

      // canonical representative check
      if (!isCanonical(m)) {
        continue;
      }

      // compute SNF only now
      final int[] r = snf(m);
      mSeen.add(new IntTriple(r));

    } while (bump.bump(m));

    return Z.valueOf(mSeen.size());
  }
}
