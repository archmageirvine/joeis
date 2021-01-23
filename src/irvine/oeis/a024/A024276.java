package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009610;

/**
 * A024276 Expansion of sinh(tan(x)*sinh(x))/2.
 * @author Sean A. Irvine
 */
public class A024276 extends A009610 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

