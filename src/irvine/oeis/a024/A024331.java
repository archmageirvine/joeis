package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009423;

/**
 * A024331 Expansion of <code>log(1+x)*log(1+tanh(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024331 extends A009423 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

