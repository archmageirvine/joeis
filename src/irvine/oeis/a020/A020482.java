package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020482 Greatest p with p, q both prime, p+q = 2n.
 * @author Sean A. Irvine
 */
public class A020482 extends A020481 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(2);
    return mN.subtract(super.next());
  }
}
