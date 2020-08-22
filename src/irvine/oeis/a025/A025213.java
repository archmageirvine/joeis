package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A025213 a(n) = floor(3rd elementary symmetric function of Sum_{j=1..k} 1/j, k = 1,2,...,n).
 * @author Sean A. Irvine
 */
public class A025213 extends A025212 {

  private int mN = 2;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    final Q si = h(++mN);
    for (int j = 2; j < mN; ++j) {
      final Q sj = si.multiply(h(j));
      for (int k = 1; k < j; ++k) {
        mSum = mSum.add(sj.multiply(h(k)));
      }
    }
    return mSum.floor();
  }
}
