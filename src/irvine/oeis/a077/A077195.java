package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077195 a(n) = A077194(n)/n.
 * @author Sean A. Irvine
 */
public class A077195 extends A077194 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

