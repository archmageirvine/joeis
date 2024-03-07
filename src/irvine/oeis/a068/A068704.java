package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068704 a(n) = smallest prime obtained as the concatenation of n^k, n^(k-1), n^(k-2), ..., n^2, n, 1 for some k &gt;= 1; or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A068704 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final StringBuilder sb = new StringBuilder("1");
    Z m = mN;
    while (true) {
      sb.insert(0, m);
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
      m = m.multiply(mN);
    }
  }
}
