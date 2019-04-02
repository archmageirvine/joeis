package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A005611 Number of Boolean functions realized by cascades of n gates.
 * @author Sean A. Irvine
 */
public class A005611 extends A005608 {

  @Override
  protected Z butlerN(final int n, final int s, final int r) {
    return butlerS(2, s, r, n).divide(Binomial.binomial(s, 2));
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.valueOf(14);
    }
    return butlerN(mN, 4, 2);
  }
}

