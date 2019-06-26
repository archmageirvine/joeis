package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009547;

/**
 * A024230 Expansion of <code>sin(x)*sin(sinh(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024230 extends A009547 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

