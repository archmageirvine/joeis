package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a051.A051924;

/**
 * A024482 <code>a(n) = (1/2)*(binomial(2n, n) - binomial(2n-2, n-1))</code>.
 * @author Sean A. Irvine
 */
public class A024482 extends A051924 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
