package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009667;

/**
 * A024225 Expansion of <code>tan(sin(x))*x/2</code>.
 * @author Sean A. Irvine
 */
public class A024225 extends A009667 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

