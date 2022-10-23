package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001972 Expansion of 1/((1-x)^2*(1-x^4)) = 1/( (1+x)*(1+x^2)*(1-x)^3 ).
 * @author Sean A. Irvine
 */
public class A001972 extends Sequence0 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().shiftRight(3);
  }
}
