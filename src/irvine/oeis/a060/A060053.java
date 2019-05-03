package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A060053 Number of <code>r-bicoverings (or</code> restricted proper <code>2-covers)</code> of an <code>n-set</code>.
 * @author Sean A. Irvine
 */
public class A060053 implements Sequence {

  private static final Q NEG_HALF = Q.HALF.negate();
  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  private Q innerSum(final int n, final int m) {
    final long top = m * (m - 1) / 2;
    Q sum = Q.ZERO;
    Q h = Q.ONE;
    for (int k = 0; k <= n; ++k, h = h.multiply(NEG_HALF)) {
      final Q t = h.multiply(new Q(Binomial.binomial(top, n - k), mF.factorial(k)));
      sum = sum.add(t);
    }
    return sum;
  }

  private Q outerSum(final int n) {
    Q sum = Q.ZERO;
    for (int m = 0; m <= 3 * n + 1; ++m) {
      sum = sum.add(innerSum(n, m).divide(mF.factorial(m)));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    final Q sum = outerSum(mN).multiply(mF.factorial(mN));
    final CR x = CR.valueOf(sum.toZ()).divide(CR.E);
    return x.add(CR.HALF).floor(32);
  }
}
