package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A024483 <code>a(n) = binomial(2*n, n) mod binomial(2*n-2, n-1)</code>.
 * @author Sean A. Irvine
 */
public class A024483 extends A000108 {

  private long mN = -1;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
