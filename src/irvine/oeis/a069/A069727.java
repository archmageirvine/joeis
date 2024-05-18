package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069727 Number of nonisomorphic unrooted Eulerian planar maps with n edges (Eulerian means that all vertices are of even valency; there is an Eulerian cycle).
 * @author Sean A. Irvine
 */
public class A069727 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Z sum = Binomial.binomial(2 * mN, mN).multiply(3).shiftLeft(mN - 1).divide(mN + 1).divide(mN + 2);
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      if (d != mN) {
        final long nd = mN / d;
        sum = sum.add(Functions.PHI.z(nd).multiply((nd & 1) == 0 ? 4 : 3).multiply(Binomial.binomial(2 * d, d)).shiftLeft(d - 2));
      }
    }
    sum = sum.divide(2 * mN);
    if (mN == 2) {
      sum = sum.add(1);
    } else if ((mN & 1) == 1) {
      sum = sum.add(Binomial.binomial(mN - 1, (mN - 1) / 2).shiftLeft((mN - 1) / 2).divide(mN + 1));
    } else {
      sum = sum.add(Binomial.binomial(mN, mN / 2).shiftLeft((mN - 4) / 2).divide(mN + 2));
    }
    return sum;
  }
}

