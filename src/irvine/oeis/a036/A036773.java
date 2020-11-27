package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036773 Number of labeled rooted trees with a degree constraint: ((5*n)!/(120^n)) * C(5*n+1, n).
 * @author Sean A. Irvine
 */
public class A036773 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(5 * mN)
        .multiply(5 * mN - 1)
        .multiply(5 * mN - 2)
        .multiply(5 * mN - 3)
        .multiply(5 * mN - 4)
        .divide(120);
    }
    return mF.multiply(Binomial.binomial(5 * mN + 1, mN));
  }
}
