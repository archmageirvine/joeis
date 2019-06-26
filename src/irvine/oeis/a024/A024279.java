package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009706;

/**
 * A024279 Expansion of <code>tan(tan(x)*sinh(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024279 extends A009706 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

