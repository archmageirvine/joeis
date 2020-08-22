package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009360;

/**
 * A024256 Expansion of log(1+sinh(x)*x)/2.
 * @author Sean A. Irvine
 */
public class A024256 extends A009360 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

