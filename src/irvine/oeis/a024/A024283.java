package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009764;

/**
 * A024283 E.g.f. 1/2 * tan(x)^2 (even powers only).
 * @author Sean A. Irvine
 */
public class A024283 extends A009764 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

