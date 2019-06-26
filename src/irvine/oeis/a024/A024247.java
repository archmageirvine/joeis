package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009627;

/**
 * A024247 Expansion of e.g.f. <code>sinh(x)*sin(tan(x))/2</code>, even powers only.
 * @author Sean A. Irvine
 */
public class A024247 extends A009627 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

