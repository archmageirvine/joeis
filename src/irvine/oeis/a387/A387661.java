package irvine.oeis.a387;

import irvine.math.z.Z;

/**
 * A387661 allocated for Yifan Xie.
 * @author Sean A. Irvine
 */
public class A387661 extends A387318 {

  @Override
  protected Z select(final int label, final int[] seen) {
    int cnt = 0;
    for (final int v : seen) {
      if (v == label) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
