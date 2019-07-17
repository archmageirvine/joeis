package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006327 <code>a(n) = Fibonacci(n) - 3</code>. Number of total preorders.
 * @author Sean A. Irvine
 */
public class A006327 extends A000045 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(3);
  }
}

