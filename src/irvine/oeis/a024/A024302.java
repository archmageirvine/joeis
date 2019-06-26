package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009493;

/**
 * A024302 Expansion of <code>sin(sinh(x))*x/2</code>.
 * @author Sean A. Irvine
 */
public class A024302 extends A009493 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

