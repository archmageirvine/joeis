package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394190 Irregular triangle read by rows: T(n,k) is the number of linear intervals of height k in the weak order on B_n (0 &lt;= k &lt;= 2*n-1).
 * @author Sean A. Irvine
 */
public class A394190 extends Sequence2 {

  // After Ludovic Schwob

  private long mN = 1;
  private long mM = 1;

  private Q coeff(final long h, final long i) {
    return new Q(Integers.SINGLETON.sum(0, h, j -> Binomial.binomial(h + i + 1, h - j).multiply(Binomial.binomial(j + i, j))),
      Binomial.binomial(h + i, i).multiply(h + i + 1).shiftLeft(h + 1));
  }

  @Override
  public Z next() {
    if (++mM >= 2 * mN) {
      ++mN;
      mM = 0;
    }
    final Z nW = Functions.FACTORIAL.z(mN).shiftLeft(mN);
    if (mM == 0) {
      return nW;
    }
    if (mM == 1) {
      return nW.multiply(mN).divide2();
    }
    Q s = (mM & 1) == 1 ? new Q(1, mM + 1) : Q.ZERO;
    if (mM < mN) {
      s = s.add(new Q(2 * (mN - mM), mM + 1));
    }
    if (mM == 3) {
      s = s.add(Q.ONE_QUARTER);
    }
    final long k = mM;
    s = s.add(Rationals.SINGLETON.sum(Math.max(0, k - mN), k / 2 - 1, j -> coeff(k - 2 * j - 1, j)).multiply(2));
    return s.multiply(nW).toZ();
  }
}
