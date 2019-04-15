package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001911 <code>a(n) = Fibonacci(n+3) - 2</code>.
 * @author Sean A. Irvine
 */
public class A001911 extends A000045 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
