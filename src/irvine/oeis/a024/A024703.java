package irvine.oeis.a024;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A024703.
 * @author Sean A. Irvine
 */
public class A024703 extends A024702 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next()).bigOmega());
  }
}
