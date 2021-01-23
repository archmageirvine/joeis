package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009468;

/**
 * A024334 Expansion of sin(log(1+x)^2)/2.
 * @author Sean A. Irvine
 */
public class A024334 extends A009468 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

