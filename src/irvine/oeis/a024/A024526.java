package irvine.oeis.a024;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024526 a(n) = Sum_{0 &lt;= i &lt; j &lt;= n} (prime(j) - prime(i))^2, where prime(0) = 1.
 * @author Sean A. Irvine
 */
public class A024526 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z pn = Puma.primeZ(mN);
    for (int k = 0; k < mN; ++k) {
      mSum = mSum.add(pn.subtract(Puma.prime(k)).square());
    }
    return mSum;
  }
}
