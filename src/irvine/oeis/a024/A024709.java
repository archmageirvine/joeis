package irvine.oeis.a024;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A024709 Least prime divisor of A024702(n).
 * @author Sean A. Irvine
 */
public class A024709 extends A024702 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).toZArray()[0];
  }
}
