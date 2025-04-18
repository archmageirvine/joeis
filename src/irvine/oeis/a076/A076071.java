package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076071 a(n) = A076070(n)/n.
 * @author Sean A. Irvine
 */
public class A076071 extends A076070 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
