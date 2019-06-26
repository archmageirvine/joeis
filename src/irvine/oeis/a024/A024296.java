package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009378;

/**
 * A024296 E.g.f.: <code>log(1+tan(x)*sinh(x))/2</code> (even powers only).
 * @author Sean A. Irvine
 */
public class A024296 extends A009378 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

