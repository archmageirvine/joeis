package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009665;

/**
 * A024300 Expansion of tan(sin(x))*sin(x)/2.
 * @author Sean A. Irvine
 */
public class A024300 extends A009665 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

