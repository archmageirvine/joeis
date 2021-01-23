package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009710;

/**
 * A024290 Expansion of tan(tan(x)^2)/2.
 * @author Sean A. Irvine
 */
public class A024290 extends A009710 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

