package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002899 Number of n-step polygons on f.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A002899 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z fours = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      Z t = Z.ZERO;
      final long nk = mN - k;
      for (long j = 0; j <= nk; ++j) {
        t = t.add(Binomial.binomial(nk, j).square().multiply(Binomial.binomial(2 * nk - 2 * j, nk - j)).multiply(Binomial.binomial(2 * j, j)));
      }
      sum = sum.add(t.multiply(Binomial.binomial(mN, nk).multiply(fours)));
      fours = fours.multiply(-4);
    }
    return sum;
  }
}
