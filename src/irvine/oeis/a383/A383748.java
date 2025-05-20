package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383748 a(n) = q  is the smallest integer, such that the numbers -1/q, i/q, -i/q with i = sqrt(-1), are three zeros of the polynomial P(A783747(n),z) = Sum_{k=1..r} d(k)*z^(k-1) where d(1) &lt; d(2), ..., &lt; d(r) are the r divisors of A383747(n).
 * @author Sean A. Irvine
 */
public class A383748 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final Z[] divs = Jaguar.factor(++mN).divisorsSorted();
      final Polynomial<Z> p = Polynomial.create(divs);
      for (final Z d : divs) {
        final Q qd = new Q(Z.NEG_ONE, d);
        if (PolynomialUtils.eval(Rationals.SINGLETON, p, qd).isZero()) {
          final CC iqd = new CC(CR.ZERO, CR.valueOf(qd));
          if (PolynomialUtils.eval(ComputableComplexField.SINGLETON, p, iqd).isZero()
            && PolynomialUtils.eval(ComputableComplexField.SINGLETON, p, ComputableComplexField.SINGLETON.negate(iqd)).isZero()) {
            return d;
          }
        }
      }
    }

  }
}
