package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A006079.
 * @author Sean A. Irvine
 */
public class A006079 extends A000108 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      super.next();
      return Z.ONE;
    }
    return super.next().subtract(Binomial.binomial(mN, mN / 2)).divide2();
  }
}

