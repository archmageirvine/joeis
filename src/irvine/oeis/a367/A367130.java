package irvine.oeis.a367;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A367020.
 * @author Sean A. Irvine
 */
public class A367130 extends A000058 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
