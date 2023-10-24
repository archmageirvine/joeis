package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a057.A057588;

/**
 * A064145.
 * @author Sean A. Irvine
 */
public class A366808 extends A057588 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
