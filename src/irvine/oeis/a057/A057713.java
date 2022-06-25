package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A057708.
 * @author Sean A. Irvine
 */
public class A057713 extends A057588 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).leastPrimeFactor();
  }
}
