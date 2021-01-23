package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009741;

/**
 * A024250 Expansion of tan(x)*sin(sinh(x))/2.
 * @author Sean A. Irvine
 */
public class A024250 extends A009741 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

