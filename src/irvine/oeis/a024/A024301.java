package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009548;

/**
 * A024301 E.g.f.: sin(x)*sin(tan(x))/2 (even powers only).
 * @author Sean A. Irvine
 */
public class A024301 extends A009548 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

