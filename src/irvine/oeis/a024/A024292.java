package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009749;

/**
 * A024292 Expansion of <code>tan(x)*tan(sinh(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024292 extends A009749 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

