package irvine.oeis.a034;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A034381 Number of labeled cyclic groups with n elements.
 * @author Sean A. Irvine
 */
public class A034381 extends A000142 {

  private Z mN = Z.ZERO;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return super.next().divide(Euler.phi(mN));
  }
}
