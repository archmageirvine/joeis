package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009683;

/**
 * A024274 Expansion of e.g.f. <code>tan(sinh(x))*x/2</code> (even powers only).
 * @author Sean A. Irvine
 */
public class A024274 extends A009683 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

