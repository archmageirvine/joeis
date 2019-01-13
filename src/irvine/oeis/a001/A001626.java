package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000186;

/**
 * A001626.
 * @author Sean A. Irvine
 */
public class A001626 extends A000186 {

  {
    super.next();
  }

  private int mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(++mN).multiply2().add(super.next());
    return mA;
  }
}

