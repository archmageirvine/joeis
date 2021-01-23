package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009359;

/**
 * A024275 E.g.f: log(1+sinh(x)*sin(x))/2 (even powers only).
 * @author Sean A. Irvine
 */
public class A024275 extends A009359 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

