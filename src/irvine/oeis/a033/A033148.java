package irvine.oeis.a033;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a000.A000170;

/**
 * A033148.
 * @author Sean A. Irvine
 */
public class A033148 extends A000170 {

  private int mN = 0;

  private int[] rotate90(final int[] q) {
    final int n = q.length;
    final int[] r = new int[n];
    for (int x = 0; x < n; ++x) {
      r[q[x]] = n - x - 1;
    }
    return r;
  }

  @Override
  protected Z count(final int[] q) {
    final int[] q1 = rotate90(q);
    return Arrays.equals(q, q1) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z next() {
    final long r = ++mN & 3;
    return r > 1 ? Z.ZERO : count(new int[mN], 0);
  }
}
