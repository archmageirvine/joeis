package irvine.oeis.a064;

import irvine.oeis.a057.A057572;

/**
 * A064732 Number of labeled Hugenholtz diagrams with n nodes.
 * @author Sean A. Irvine
 */
public class A064732 extends A057572 {

  private void label(final int offset, final int[] diagram, final int[][] pairs, final int[] in, final int[] out) {

    if (offset == pairs.length) {
      //System.out.println("in: " + Arrays.toString(in) + " out: " + Arrays.toString(out));
      ++mCount;
      return;
    }
    for (int i = 0; i <= Math.min(2, diagram[offset]); ++i) {
      final int u = pairs[offset][0];
      final int v = pairs[offset][1];
      final int j = diagram[offset] - i;
      if (j <= 2) {
        if (out[u] + i <= 2 && in[v] + i <= 2 && out[v] + j <= 2 && in[u] + j <= 2) {
          out[u] += i;
          in[v] += i;
          out[v] += j;
          in[u] += j;
          label(offset + 1, diagram, pairs, in, out);
          out[u] -= i;
          in[v] -= i;
          out[v] -= j;
          in[u] -= j;
        }
      }
    }
  }

  protected void label(final int[] diagram, final int[][] pairs) {
    label(0, diagram, pairs, new int[mN], new int[mN]);
  }
}
