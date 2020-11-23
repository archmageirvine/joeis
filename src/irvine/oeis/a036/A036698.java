package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000603;

/**
 * A036698 a(n)=number of Gaussian integers z=a+bi satisfying |z|&lt;=n, a&gt;0, b&gt;=0.
 * @author Sean A. Irvine
 */
public class A036698 extends A000603 {

  @Override
  public Z next() {
    return super.next().subtract(mN + 1);
  }
}

