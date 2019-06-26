package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009683;

/**
 * A024274 Expansion of <code>tan(sinh(x)).x/2</code>.
 * @author Sean A. Irvine
 */
public class A024274 extends A009683 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

