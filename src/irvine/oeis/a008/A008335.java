package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A008335.
 * @author Sean A. Irvine
 */
public class A008335 extends A008864 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next()).omega());
  }
}


