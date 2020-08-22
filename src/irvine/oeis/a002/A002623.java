package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002623 Expansion of 1/((1-x)^4*(1+x)).
 * @author Sean A. Irvine
 */
public class A002623 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(2).multiply(mN.add(4)).multiply(mN.multiply2().add(3)).divide(24);
  }
}
