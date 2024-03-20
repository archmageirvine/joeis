package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068838.
 * @author Sean A. Irvine
 */
public class A068876 extends Sequence1 {

  private int mN = 0;

  private void bump(final StringBuilder sb) {
    for (int k = sb.length() - 1; k >= 0; --k) {
      final int u = sb.charAt(k) + 2;
      if (u <= '9') {
        sb.setCharAt(k, (char) u);
        return;
      } else {
        sb.setCharAt(k, (char) ('0' + (u & 1)));
      }
    }
    throw new RuntimeException();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    final StringBuilder sb = new StringBuilder();
    int t;
    if ((mN & 1) == 0) {
      sb.append(2);
      t = 1;
    } else {
      sb.append(1);
      t = 0;
    }
    for (int k = 1; k < mN; ++k) {
      sb.append(t);
      t = 1 - t;
    }
    while (true) {
      final Z v = new Z(sb);
      if (v.isProbablePrime()) {
        return v;
      }
      bump(sb);
    }
  }
}
