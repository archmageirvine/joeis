package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009655;

/**
 * A024336 Expansion of e.g.f.: <code>tan(log(1+x)^2)/2</code>.
 * @author Sean A. Irvine
 */
public class A024336 extends A009655 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

