package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009801;

/**
 * A024262 Expansion of tanh(sin(x)^2)/2.
 * @author Sean A. Irvine
 */
public class A024262 extends A009801 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

