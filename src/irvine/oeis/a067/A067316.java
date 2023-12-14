package irvine.oeis.a067;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067316 a(n) is the number of values of j, 0 &lt;= j &lt;= n, such that 1 + binomial(n,j) is prime.
 * @author Sean A. Irvine
 */
public class A067316 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; 2 * k <= mN; ++k) {
      if (Binomial.binomial(mN, k).add(1).isProbablePrime()) {
        cnt += 2 * k == mN ? 1 : 2;
      }
    }
    return Z.valueOf(cnt);
  }
}

