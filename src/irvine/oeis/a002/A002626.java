package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002626 Expansion of 1/((1-x)^3 (1-x^2)^2 (1-x^3) (1-x^4)).
 * @author Sean A. Irvine
 */
public class A002626 extends Sequence0 {

  private static final Z Z135 = Z.valueOf(135);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().add(56).multiply(mN).add(570).multiply(mN).add(2492).multiply(mN).add(4175).signedAdd(mN.isEven(), Z135).multiply(mN.add(1)).multiply(mN.add(13)).add(69119).divide(69120);
  }
}
