package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058305 Numerator of H(n), where H(0)=-1/12, H(n) = number of equivalence classes of positive definite quadratic forms a*x^2+b*x*y+c*y^2 with discriminant b^2-4ac = -n, counting forms equivalent to x^2+y^2 (resp. x^2+x*y+y^2) with multiplicity 1/2 (resp. 1/3).
 * @author Sean A. Irvine
 */
public class A058305 extends Sequence0 {

  private static final Q C0 = new Q(-1, 12);
  private long mN = -1;

  private Q h(final long n) {
    Q sum = Q.ZERO;
    for (final Z d : Jaguar.factor(LongUtils.sqrt(n / Jaguar.factor(n).core().longValue())).divisors()) {
      final long bigD = -n / d.square().longValueExact();
      if ((bigD & 3) < 2) {
        sum = sum.add(new Q(LongUtils.classNumber(bigD), Long.max(1, bigD + 6)));
      }
    }
    return sum;
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(++mN == 0 ? C0 : h(mN));
  }
}
