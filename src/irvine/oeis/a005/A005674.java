package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A005674.
 * @author Sean A. Irvine
 */
public class A005674 extends A000045 {

  private int mN = -1;
  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN).add(Z.ONE.shiftLeft(mN / 2)).add(Z.ONE.shiftLeft(++mN / 2)).subtract(super.next());
  }
}

