package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049384 a(0)=1, a(n+1) = (n+1)^a(n).
 * @author Sean A. Irvine
 */
public class A049384 implements Sequence {

  private Z mN = Z.NEG_ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (!mN.isZero()) {
      mA = mN.pow(mA);
    }
    return mA;
  }
}
