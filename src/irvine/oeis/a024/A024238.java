package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009595;

/**
 * A024238 Expansion of sinh(sin(x)*x)/2.
 * @author Sean A. Irvine
 */
public class A024238 extends A009595 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

