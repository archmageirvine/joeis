package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071622 a(n) = (-1)*Sum_{k=1..n} (-1)^floor((4/3)^k).
 * @author Sean A. Irvine
 */
public class A071622 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN += 2;
    mA = mA.multiply(3);
    mSum = mSum.subtract(Z.NEG_ONE.pow(Z.ONE.shiftLeft(mN).divide(mA)));
    return mSum;
  }
}
