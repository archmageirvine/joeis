package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057562.
 * @author Sean A. Irvine
 */
public class A057572 implements Sequence {

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

  private boolean isConsistent(final int[] diagram, final int[][] pairs) {
    final int[] deg = new int[mN];
    for (int k = 0; k < diagram.length; ++k) {
      deg[pairs[k][0]] += diagram[k];
      if (deg[pairs[k][0]] > 4) {
        return false;
      }
      deg[pairs[k][1]] += diagram[k];
      if (deg[pairs[k][1]] > 4) {
        return false;
      }
    }
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

  private void count(final int offset, final int[] diagram, final int sum, final int[][] pairs) {
    if (offset == pairs.length) {
      if (sum == mNLines && isConsistent(diagram, pairs)) {
        //System.out.println("+" + Arrays.toString(diagram));
        label(diagram, pairs);
      }
      return;
    }
    if (2 * offset == mNLines - 1 && sum != 4) {
      return;
    }
    for (int i = 0; i < 4; ++i) {
      diagram[offset] = i;
      if (sum <= mNLines) {
        count(offset + 1, diagram, sum + i, pairs);
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
    count(0, diagram, 0, pairs);
    return Z.valueOf(mCount);
  }
}
