package irvine.oeis.a053;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a007.A007416;

/**
 * A053192.
 * @author Sean A. Irvine
 */
public class A053212 extends A007416 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma0();
  }
}
