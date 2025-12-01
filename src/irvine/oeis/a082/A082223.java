package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082223 a(n) = (n-th partial sum of A082220)/n = (n-th partial sum of the first column of array A082218)/n.
 * @author Sean A. Irvine
 */
public class A082223 extends A082220 {

  private Z mSum = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(super.next());
    return mSum.divide(++mN);
  }
}
