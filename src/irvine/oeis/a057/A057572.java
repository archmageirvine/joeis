package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A057572 Number of unlabeled Hugenholz diagrams with n nodes.
 * @author Sean A. Irvine
 */
public class A057572 extends Sequence2 {

  // After Paul Stevenson

  protected int mN = 1;
  private int mNLines = 2;
  protected long mCount = 0;

  private boolean isConnected(final int[] diag, final int[][] pairs) {
    final boolean[] seen = new boolean[mN];
    final int[] stack = new int[mN];
    int sp = 0;
    int spFree = 1;
    seen[0] = true;
    int count = 1;
    while (sp < spFree) {
      if (count == mN) {
        return true;
      }
      final int v = stack[sp++];
      for (int k = 0; k < pairs.length; ++k) {
        if (diag[k] > 0) {
          if (pairs[k][0] == v) {
            final int u = pairs[k][1];
            if (!seen[u]) {
              seen[u] = true;
              stack[spFree++] = u;
              ++count;
            }
          } else if (pairs[k][1] == v) {
            final int u = pairs[k][0];
            if (!seen[u]) {
              seen[u] = true;
              stack[spFree++] = u;
              ++count;
            }
          }
        }
      }
    }
    return false;
  }

  private boolean isConsistent(final int[] diagram, final int[][] pairs, final int[] deg) {
    for (final int i : deg) {
      if (i != 4) {
        return false;
      }
    }
    //System.out.println("Doing connection test on: " + Arrays.toString(diagram));
    return isConnected(diagram, pairs);
  }

  protected void label(final int[] diagram, final int[][] pairs) {
    ++mCount;
  }

  private void count(final int offset, final int[] diagram, final int sum, final int[][] pairs, final int[] deg) {
    if (offset == pairs.length) {
      if (sum == mNLines && isConsistent(diagram, pairs, deg)) {
        //System.out.println("+" + Arrays.toString(diagram));
        label(diagram, pairs);
      }
      return;
    }
    final int u = pairs[offset][0];
    final int v = pairs[offset][1];
    if (u > 0 && deg[u - 1] != 4) {
      return; // Failed to achieve degree 4 on previous vertex
    }
    for (int i = 0; i < 4; ++i) {
      if (sum <= mNLines) {
        if (deg[u] + i <= 4 && deg[v] + i <= 4) {
          diagram[offset] = i;
          deg[u] += i;
          deg[v] += i;
          count(offset + 1, diagram, sum + i, pairs, deg);
          deg[v] -= i;
          deg[u] -= i;
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    mNLines = 2 * mN;
    mCount = 0;
    final int npairs = mN * (mN - 1) / 2;
    final int[][] pairs = new int[npairs][2];
    for (int k = 0, i = 0; i < mN; ++i) {
      for (int j = i + 1; j < mN; ++j, ++k) {
        pairs[k][0] = i;
        pairs[k][1] = j;
      }
    }
    final int[] diagram = new int[npairs];
    count(0, diagram, 0, pairs, new int[mN]);
    return Z.valueOf(mCount);
  }
}
