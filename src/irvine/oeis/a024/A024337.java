package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009575;

/**
 * A024337 Expansion of <code>sinh(log(1+x))*log(1+x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024337 extends A009575 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

