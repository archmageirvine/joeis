package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A005672 <code>a(n) = Fibonacci(n+1) - 2^floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A005672 extends A000045 {

  private int mN = -1;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE.shiftLeft(++mN / 2));
  }
}

