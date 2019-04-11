package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000777 <code>a(n) =</code> (n+2)*Catalan(n)-1.
 * @author Sean A. Irvine
 */
public class A000777 extends A000108 {

  @Override
  public Z next() {
    return super.next().multiply(mN + 2).subtract(1);
  }
}
