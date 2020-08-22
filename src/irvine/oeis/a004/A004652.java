package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004652 Expansion of x*(1+x^2+x^4)/((1-x)*(1-x^2)*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A004652 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(3).divide(4);
  }
}

