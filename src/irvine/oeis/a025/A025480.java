package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a000.A000265;

/**
 * A025480 <code>a(2n) =</code> n, <code>a(2n+1) = a(n)</code>.
 * @author Sean A. Irvine
 */
public class A025480 extends A000265 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}

