package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025011 a(1) = 7; a(n+1) = a(n)-th composite.
 * @author Sean A. Irvine
 */
public class A025011 extends A025010 {

  @Override
  protected Z initial() {
    return Z.SEVEN;
  }
}
