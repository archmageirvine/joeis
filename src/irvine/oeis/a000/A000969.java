package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000969 Expansion of <code>(1+x+2*x^2)/((1-x)^2*(1-x^3))</code>.
 * @author Sean A. Irvine
 */
public class A000969 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().add(3).multiply(mN.add(1)).divide(3);
  }
}
