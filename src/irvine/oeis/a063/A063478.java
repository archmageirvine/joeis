package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A063478 a(n) = Sum_{d|Fibonacci(n)} d^2.
 * @author Sean A. Irvine
 */
public class A063478 extends A000045 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma2();
  }
}
