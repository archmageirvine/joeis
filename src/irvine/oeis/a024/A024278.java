package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009698;

/**
 * A024278 Expansion of e.g.f.: <code>tan(tan(x))*sin(x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024278 extends A009698 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

