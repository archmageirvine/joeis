package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009705;

/**
 * A024245 Expansion of tan(tan(x)*sin(x))/2.
 * @author Sean A. Irvine
 */
public class A024245 extends A009705 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

