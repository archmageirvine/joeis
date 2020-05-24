package irvine.oeis.a032;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032095 Number of reversible strings with <code>n-1</code> black beads and <code>n-1</code> white beads. String is not palindromic.
 * @author Sean A. Irvine
 */
public class A032095 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if ((mN & 1) == 0) {
      return Binomial.binomial(2 * mN  - 2, mN - 1).divide2();
    } else {
      return Binomial.binomial(2 * mN - 2, mN - 1).subtract(Binomial.binomial(mN - 1, (mN - 1) / 2)).divide2();
    }
  }
}
