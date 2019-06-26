package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009811;

/**
 * A024231 Expansion of <code>tanh(tan(x))*sin(x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024231 extends A009811 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

