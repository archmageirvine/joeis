package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001697 a(n+1) = a(n)(a(0) + ... + a(n)).
 * @author Sean A. Irvine
 */
public class A001697 extends Sequence0 {

  private Z mA = null;
  private Z mS = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mS.multiply(mA);
      mS = mS.add(mA);
    }
    return mA;
  }
}
