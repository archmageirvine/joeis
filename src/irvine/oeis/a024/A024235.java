package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009744;

/**
 * A024235 E.g.f. <code>tan(x)*sin(x)/2</code> (even powers only).
 * @author Sean A. Irvine
 */
public class A024235 extends A009744 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

