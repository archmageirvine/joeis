package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a004.A004394;

/**
 * A007626.
 * @author Sean A. Irvine
 */
public class A007626 extends A004394 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma();
  }
}
