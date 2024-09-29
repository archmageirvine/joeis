package irvine.oeis.a072;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072406 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.TWO;
    }
    long cnt = 0;
    for (long k = 0; k <= mN; ++k) {
      if (Binomial.binomial(mN, k).subtract(Binomial.binomial(mN - 2, k - 1)).isOdd()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
