package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a006.A006093;

/**
 * A008328.
 * @author Sean A. Irvine
 */
public class A008328 extends A006093 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next()).sigma0());
  }
}


