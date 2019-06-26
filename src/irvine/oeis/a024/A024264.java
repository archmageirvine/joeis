package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009675;

/**
 * A024264 Expansion of <code>tan(sin(x)^2)/2</code>.
 * @author Sean A. Irvine
 */
public class A024264 extends A009675 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

