package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005009 a(n) = 7*2^n.
 * @author Sean A. Irvine
 */
public class A005009 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply2();
    return mA;
  }

}

