package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a000.A000265;

/**
 * A025480 a(2n) = n, a(2n+1) = a(n).
 * @author Sean A. Irvine
 */
public class A025480 extends A000265 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}

