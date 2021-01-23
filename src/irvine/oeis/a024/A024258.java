package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009596;

/**
 * A024258 Expansion of sinh(sin(x)^2)/2.
 * @author Sean A. Irvine
 */
public class A024258 extends A009596 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

