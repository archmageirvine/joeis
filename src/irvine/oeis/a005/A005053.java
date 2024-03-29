package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005053 Expand (1-2*x)/(1-5*x).
 * @author Sean A. Irvine
 */
public class A005053 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(mA.equals(Z.ONE) ? 3 : 5);
    return mA;
  }
}

