package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000555 Number of labeled trees of diameter 4 with n nodes.
 * @author Sean A. Irvine
 */
public class A000555 extends A000551 {

  {
    setOffset(5);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE.shiftLeft(mN - 2)
                                 .subtract(1)
                                 .multiply(mN)
                                 .multiply(mN - 1));
  }
}
