package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009513;

/**
 * A024234 Expansion of sin(tan(x)*sin(x))/2.
 * @author Sean A. Irvine
 */
public class A024234 extends A009513 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

