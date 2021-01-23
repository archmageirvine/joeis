package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009613;

/**
 * A024287 Expansion of sinh(tan(x)^2)/2.
 * @author Sean A. Irvine
 */
public class A024287 extends A009613 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

