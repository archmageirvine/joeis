package irvine.oeis.a045;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045996 Number of triangles in an <code>n X n</code> grid <code>(or geoplane)</code>.
 * @author Sean A. Irvine
 */
public class A045996 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z u = Z.valueOf(mN * mN).multiply((mN - 1) * (mN - 1)).multiply((mN + 1) * (mN + 1)).divide(6);
    Z s = Z.ZERO;
    for (long m = 1; m < mN; ++m) {
      Z t = Z.ZERO;
      for (long k = 1; k < mN; ++k) {
        t = t.add(LongUtils.gcd(k, m) * (mN - k));
      }
      s = s.add(t.multiply(mN - m));
    }
    return u.subtract(s.multiply2());
  }
}
