package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A008329.
 * @author Sean A. Irvine
 */
public class A008329 extends A008864 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next()).sigma0());
  }
}


