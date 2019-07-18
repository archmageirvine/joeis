package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003136;

/**
 * A024611 Position of <code>n^2 - n + 1</code> in <code>A003136</code>.
 * @author Sean A. Irvine
 */
public class A024611 extends A003136 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z m2 = Z.valueOf(++mM).square().subtract(mM - 1);
    while (true) {
      ++mN;
      if (super.next().equals(m2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
