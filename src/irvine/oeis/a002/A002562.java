package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000170;

/**
 * A002562.
 * @author Sean A. Irvine
 */
public class A002562 extends A000170 {

  {
    next();
  }

  private int[] rotate90(final int[] q) {
    final int n = q.length;
    final int[] r = new int[n];
    for (int x = 0; x < n; ++x) {
      r[q[x]] = n - x - 1;
    }
    return r;
  }

  private int[] reflect(final int[] q) {
    final int n = q.length;
    final int[] r = new int[n];
    for (int x = 0; x < n; ++x) {
      r[x] = n - q[x] - 1;
    }
    return r;
  }

  private boolean checkFlip(final int[] q) {
    final int n = q.length;
    for (int x = 0; x < n; ++x) {
      final int y = q[x];
      final int otherY = n - y - 1;
      if (y < otherY) {
        return false;
      } else if (y > otherY) {
        return true;
      }
    }
    return false; // symmetric
  }

  private boolean lt(final int[] a, final int[] b) {
    for (int x = 0; x < a.length; ++x) {
      if (a[x] < b[x]) {
        return true;
      } else if (a[x] > b[x]) {
        return false;
      }
    }
    return false;
  }

  @Override
  protected Z count(final int[] q) {
    if (checkFlip(q)) {
      return Z.ZERO;
    }
    // All these explicit rotations are probably slow.  But doing these
    // checks was error prone when I first tried to implement it that
    // way.
    final int[] q1 = rotate90(q);
    if (lt(q1, q) || lt(reflect(q1), q)) {
      return Z.ZERO;
    }
    final int[] q2 = rotate90(q1);
    if (lt(q2, q) || lt(reflect(q2), q)) {
      return Z.ZERO;
    }
    final int[] q3 = rotate90(q2);
    if (lt(q3, q) || lt(reflect(q3), q)) {
      return Z.ZERO;
    }
    return Z.ONE;
  }
}
