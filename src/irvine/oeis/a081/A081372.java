package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081372 a(n) is the number of j from 1 to n such that binomial(n,j) is divisible by j.
 * @author Sean A. Irvine
 */
public class A081372 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Binomial.binomial(mN, k).mod(k) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

