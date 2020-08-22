package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009396;

/**
 * A024298 Expansion of log(1+tanh(x)*sin(x))/2.
 * @author Sean A. Irvine
 */
public class A024298 extends A009396 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

