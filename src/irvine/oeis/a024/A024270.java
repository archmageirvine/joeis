package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009546;

/**
 * A024270 Expansion of <code>sin(x)*sin(sin(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024270 extends A009546 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

