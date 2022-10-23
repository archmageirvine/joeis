package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005010 a(n) = 9*2^n.
 * @author Sean A. Irvine
 */
public class A005010 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply2();
    return mA;
  }

}

