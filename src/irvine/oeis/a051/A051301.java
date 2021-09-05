package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A051299.
 * @author Sean A. Irvine
 */
public class A051301 extends A000142 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next().add(1)).toZArray()[0];
  }
}
