package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A051452.
 * @author Sean A. Irvine
 */
public class A051454 extends A051452 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).toZArray()[0];
  }
}
