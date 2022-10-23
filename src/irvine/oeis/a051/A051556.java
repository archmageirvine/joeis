package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051556 a(n) = number of 0&lt;=k&lt;=n such that n+k divides binomial(n,k).
 * @author Sean A. Irvine
 */
public class A051556 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k <= mN; ++k) {
      if (Binomial.binomial(mN, k).mod(mN + k) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
