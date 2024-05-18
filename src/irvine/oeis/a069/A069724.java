package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069724 Number of nonisomorphic unrooted unicursal planar maps with n edges (unicursal means that exactly two vertices are of odd valency; there is an Eulerian path).
 * @author Sean A. Irvine
 */
public class A069724 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      final long nd = mN / d;
      if ((nd & 1) == 1) {
        sum = sum.add(Functions.PHI.z(nd).multiply(Binomial.binomial(2 * d, d)).shiftLeft(d - 2));
      }
    }
    sum = sum.divide(2 * mN);
    if (mN <= 2) {
      sum = sum.add(1);
    } else if ((mN & 1) == 1) {
      sum = sum.add(Binomial.binomial(mN - 1, (mN - 1) / 2).shiftLeft((mN - 3) / 2));
    } else {
      sum = sum.add(Binomial.binomial(mN, mN / 2).shiftLeft((mN - 6) / 2));
    }
    return sum;
  }
}

