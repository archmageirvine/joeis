package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009750;

/**
 * A024297 Expansion of e.g.f. tan(x)*tan(tan(x))/2 (even powers only).
 * @author Sean A. Irvine
 */
public class A024297 extends A009750 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

