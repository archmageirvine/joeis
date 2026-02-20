package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080391 Number of integers among the following n+1 quotients: A001405(n)/A001405(k), k=0,..,n. Number of values k for which the n-th central binomial coefficient is divisible by the k-th central binomial coefficient for 0&lt;=k=n.
 * @author Sean A. Irvine
 */
public class A080391 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z t = Binomial.binomial(++mN, mN / 2);
    long cnt = 1;
    for (long k = 0; k < mN; ++k) {
      if (t.mod(Binomial.binomial(k, k / 2)).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
