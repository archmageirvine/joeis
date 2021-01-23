package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009478;

/**
 * A024253 Expansion of sin(sin(x))*x/2.
 * @author Sean A. Irvine
 */
public class A024253 extends A009478 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

