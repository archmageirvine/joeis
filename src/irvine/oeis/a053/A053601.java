package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002884;

/**
 * A053601 Number of bases of an n-dimensional vector space over GF(2).
 * @author Sean A. Irvine
 */
public class A053601 extends A002884 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z a = super.next();
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    return a.divide(mF);
  }
}
