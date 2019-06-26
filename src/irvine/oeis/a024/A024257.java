package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009817;

/**
 * A024257 Expansion of <code>tanh(tan(x)*x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024257 extends A009817 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

