package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006221 From Apery continued fraction for zeta(3): zeta(3)=6/(5-1^6/(117-2^6/(535-3^6/(1463...))).
 * @author Sean A. Irvine
 */
public class A006221 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(34).add(51).multiply(mN).add(27).multiply(mN).add(5);
  }
}
