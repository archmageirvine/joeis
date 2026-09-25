package irvine.oeis.a137;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A137981 Triangle read by rows: expansion of p(x,t) = b(x,t)*u(x,t)*h(x,t) where b(x,t) = t*exp(x*t)/(exp(t)-1), u(x,t) = 1/(1-2*x*t+t^2), and h(x,t) = exp(2*x*t-t^2).
 * @author Sean A. Irvine
 */
public class A137981 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Q d(final long m, final long p) {
    return Rationals.SINGLETON.sum(0, m, q -> new Q(Binomial.binomial(p + m - q - 1, m - q), Functions.FACTORIAL.z(q))).multiply(Z.NEG_ONE.pow(m));
  }

  private Q c(final long n, final long k) {
    Q sum = Q.ZERO;
    final long w = n - k;
    for (long j = 0; j <= k; ++j) {
      Q s = Q.ZERO;
      for (long m = 0; m <= w / 2; ++m) {
        s = s.add(Functions.BERNOULLI.q(w - 2 * m).multiply(d(m, k - j + 1)).divide(Functions.FACTORIAL.z(w - 2 * m)));
      }
      sum = sum.add(s.multiply(Z.THREE.pow(j).shiftLeft(k - j)).divide(Functions.FACTORIAL.z(j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final Q sum = c(mN, mM);
    return sum.multiply(Functions.FACTORIAL.z(mN)).multiply(Functions.FACTORIAL.z(mN + 2)).toZ();
  }
}

