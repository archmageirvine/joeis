package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009836;

/**
 * A024266 Expansion of <code>tanh(x)*tan(tan(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024266 extends A009836 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

