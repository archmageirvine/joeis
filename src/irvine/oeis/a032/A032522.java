package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a000.A000170;

/**
 * A032522 Number of point symmetric solutions to non-attacking queens problem on <code>n X n</code> board.
 * @author Sean A. Irvine
 */
public class A032522 extends A000170 {

  {
    next();
  }

  private int[] rotate180(final int[] q) {
    final int n = q.length;
    final int[] r = new int[n];
    for (int x = 0; x < n; ++x) {
      r[n - x  - 1] = n - q[x] - 1;
    }
    return r;
  }

  @Override
  protected Z count(final int[] q) {
    final int[] q1 = rotate180(q);
    return Arrays.equals(q, q1) ? Z.ONE : Z.ZERO;
  }
}
