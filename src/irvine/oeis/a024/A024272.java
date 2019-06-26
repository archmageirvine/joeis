package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009747;

/**
 * A024272 E.g.f. <code>tan(x)*sinh(x)/2</code> (even powers only).
 * @author Sean A. Irvine
 */
public class A024272 extends A009747 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

