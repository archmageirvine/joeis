package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081768 Number of k, 1&lt;=k&lt;=n, such that C(n,k) divides C(2n,2k).
 * @author Sean A. Irvine
 */
public class A081768 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Binomial.binomial(2 * mN, 2 * k, Binomial.binomial(mN, k)).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

