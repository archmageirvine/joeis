package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A025214 a(n) = floor(4th elementary symmetric function of Sum_{j=1..k} 1/j, k = 1,2,...,n).
 * @author Sean A. Irvine
 */
public class A025214 extends A025212 {

  {
    setOffset(4);
  }

  private int mN = 3;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    final Q sl = h(++mN);
    for (int i = 3; i < mN; ++i) {
      final Q si = sl.multiply(h(i));
      for (int j = 2; j < i; ++j) {
        final Q sj = si.multiply(h(j));
        for (int k = 1; k < j; ++k) {
          mSum = mSum.add(sj.multiply(h(k)));
        }
      }
    }
    return mSum.floor();
  }
}
