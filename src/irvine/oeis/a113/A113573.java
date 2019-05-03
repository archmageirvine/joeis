package irvine.oeis.a113;

import irvine.math.z.Z;

/**
 * A113573 <code>A113572(n)/n</code>.
 * @author Sean A. Irvine
 */
public class A113573 extends A113572 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
