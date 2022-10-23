package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005920 Tricapped prism numbers.
 * @author Sean A. Irvine
 */
public class A005920 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(3).add(7).multiply(mN).add(6).multiply(mN).add(2).divide2();
  }
}

