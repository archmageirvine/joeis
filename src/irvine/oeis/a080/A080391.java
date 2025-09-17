package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080391 extends Sequence1 {

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
