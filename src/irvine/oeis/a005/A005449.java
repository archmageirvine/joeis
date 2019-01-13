package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005449.
 * @author Sean A. Irvine
 */
public class A005449 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(3).add(1).multiply(mN).divide2();
  }
}
