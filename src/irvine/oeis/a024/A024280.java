package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009819;

/**
 * A024280 Expansion of tanh(tan(x)^2)/2.
 * @author Sean A. Irvine
 */
public class A024280 extends A009819 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

