package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009403;

/**
 * A024299 Expansion of <code>log(1+tanh(x)^2)/2</code>.
 * @author Sean A. Irvine
 */
public class A024299 extends A009403 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

