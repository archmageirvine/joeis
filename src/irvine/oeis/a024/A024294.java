package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009699;

/**
 * A024294 Expansion of tan(tan(x))*sinh(x)/2.
 * @author Sean A. Irvine
 */
public class A024294 extends A009699 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

