package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080392 extends Sequence1 {

  // After Peter Luschny

  private long mN = 0;

  private boolean is(final long n) {
    final Z bn = Binomial.binomial(n, n / 2);
    if (bn.mod(n) != 0) {
      return false;
    }
    int cnt = 0;
    for (long k = 2; k < n / 2; ++k) {
      if (bn.mod(Binomial.binomial(n, k)).isZero() && ++cnt > 1) {
        return true;
      }
    }
    return cnt == 0;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
