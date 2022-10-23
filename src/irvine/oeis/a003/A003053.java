package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003053 Order of orthogonal group O(n, GF(2)).
 * @author Sean A. Irvine
 */
public class A003053 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z f = Z.ONE;
    Z p = Z.ONE;
    final int m;
    if ((mN & 1) == 0) {
      m = mN / 2;
      for (int k = 1; k <= m; ++k) {
        f = f.shiftLeft(2);
        p = p.multiply(f.subtract(1));
      }
    } else {
      m = (mN + 1) / 2;
      for (int k = 1; k < m; ++k) {
        f = f.shiftLeft(2);
        p = p.multiply(f.subtract(1));
      }
    }
    return p.shiftLeft(m * m);
  }
}
