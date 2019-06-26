package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009682;

/**
 * A024260 Expansion of <code>tan(sinh(x))*sin(x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024260 extends A009682 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

