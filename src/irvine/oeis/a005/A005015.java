package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005015 a(n) = 11*2^n.
 * @author Sean A. Irvine
 */
public class A005015 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(11) : mA.multiply2();
    return mA;
  }

}

