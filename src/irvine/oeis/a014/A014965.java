package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A014965 <code>a(n) = lcm(n, Fibonacci(n))</code>.
 * @author Sean A. Irvine
 */
public class A014965 extends A000045 {

  private int mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().lcm(Z.valueOf(++mN));
  }
}
