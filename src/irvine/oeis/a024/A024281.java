package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009518;

/**
 * A024281 Expansion of <code>sin(tan(x)^2)/2</code>.
 * @author Sean A. Irvine
 */
public class A024281 extends A009518 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

