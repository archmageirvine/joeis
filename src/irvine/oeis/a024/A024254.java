package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009486;

/**
 * A024254 Expansion of sin(sin(x)^2)/2.
 * @author Sean A. Irvine
 */
public class A024254 extends A009486 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

