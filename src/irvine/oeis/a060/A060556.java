package irvine.oeis.a060;

import irvine.math.group.IntegerField;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060556 Bisection of triangle A060098: odd-indexed members of column sequences of A060098 (not counting leading zeros).
 * @author Sean A. Irvine
 */
public class A060556 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return IntegerField.SINGLETON.sum(0, (m + 1) / 2, k -> Binomial.binomial(n - k + m, 2L * m).multiply(Binomial.binomial(m + 1, 2L * k + 1)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

