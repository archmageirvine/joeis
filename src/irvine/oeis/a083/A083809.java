package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083809 Let f(n) be the smallest prime == 1 mod n (cf. A034694). Sequence gives triangle T(j,k) = f^k(j) for 1 &lt;= k &lt;= j, read by rows.
 * @author Sean A. Irvine
 */
public class A083809 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private Z mQ = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mQ = Z.valueOf(mN);
    }
    Z m = Z.ONE;
    while (true) {
      final Z t = m.multiply(mQ).add(1);
      if (t.isProbablePrime()) {
        mQ = t;
        return t;
      }
      m = m.add(1);
    }
  }
}
