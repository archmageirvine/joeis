package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009795;

/**
 * A024285 Expansion of <code>tanh(sin(x))*sin(x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024285 extends A009795 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

