package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005029 13*2^n.
 * @author Sean A. Irvine
 */
public class A005029 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(13) : mA.multiply2();
    return mA;
  }
}

