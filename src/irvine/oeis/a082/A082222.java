package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082222 a(n) = (n-th partial sum of A082219)/n = (n-th partial sum of the first row of array A082218)/n.
 * @author Sean A. Irvine
 */
public class A082222 extends A082219 {

  private Z mSum = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(super.next());
    return mSum.divide(++mN);
  }
}
