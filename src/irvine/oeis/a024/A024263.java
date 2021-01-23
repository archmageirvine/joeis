package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009611;

/**
 * A024263 Expansion of sinh(tan(x)*x)/2.
 * @author Sean A. Irvine
 */
public class A024263 extends A009611 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

