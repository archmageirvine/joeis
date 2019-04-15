package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A005442 <code>a(n) = n!*Fibonacci(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A005442 extends A000045 {

  private long mN = -1;
  private Z mF = Z.ONE;

  {
    super.next();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().multiply(mF);
  }
}

