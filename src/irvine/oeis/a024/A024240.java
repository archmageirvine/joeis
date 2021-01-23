package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009609;

/**
 * A024240 Expansion of sinh(tan(x)*sin(x))/2.
 * @author Sean A. Irvine
 */
public class A024240 extends A009609 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

