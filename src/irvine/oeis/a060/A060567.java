package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060565.
 * @author Sean A. Irvine
 */
public class A060567 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long cnt = 0;
    final Z t = Binomial.binomial(++mN, 2);
    for (long k = 0; k <= mN; ++k) {
      if (Binomial.binomial(mN, k).mod(t).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
