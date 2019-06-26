package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009835;

/**
 * A024228 Expansion of <code>tanh(x)*tan(sin(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024228 extends A009835 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

