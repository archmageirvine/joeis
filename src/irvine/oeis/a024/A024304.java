package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009740;

/**
 * A024304 Expansion of tan(x)*sin(sin(x))/2.
 * @author Sean A. Irvine
 */
public class A024304 extends A009740 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

