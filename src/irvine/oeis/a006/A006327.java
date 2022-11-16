package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006327 a(n) = Fibonacci(n) - 3. Number of total preorders.
 * @author Sean A. Irvine
 */
public class A006327 extends A000045 {

  {
    setOffset(4);
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

