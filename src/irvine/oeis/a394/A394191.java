package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394191 Total number of linear intervals in the weak order on the Coxeter group B_n.
 * @author Sean A. Irvine
 */
public class A394191 extends Sequence2 {

  // After Ludovic Schwob

  private long mN = 1;

  private Q coeff(final long h, final long i) {
    return new Q(Integers.SINGLETON.sum(0, h, j -> Binomial.binomial(h + i + 1, h - j).multiply(Binomial.binomial(j + i, j))),
      Binomial.binomial(h + i, i).multiply(h + i + 1).shiftLeft(h + 1));
  }

  @Override
  public Z next() {
    ++mN;
    Q s = new Q(mN + 2, 2);
    for (long k = 2; k < 2 * mN; ++k) {
      if ((k & 1) == 1) {
        s = s.add(new Q(1, k + 1));
      }
      if (k < mN) {
        s = s.add(new Q(2 * (mN - k), k + 1));
      }
      if (k == 3) {
        s = s.add(Q.ONE_QUARTER);
      }
      final long kk = k;
      s = s.add(Rationals.SINGLETON.sum(Math.max(0, kk - mN), kk / 2 - 1, j -> coeff(kk - 2 * j - 1, j)).multiply(2));
    }
    return s.multiply(Functions.FACTORIAL.z(mN).shiftLeft(mN)).toZ();
  }
}
