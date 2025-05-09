package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.ZPolynomialFunction;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077155 Let p(2n+1,x)=(x+1)(x+2)...(x+2n)(x+2n+1), a(n) is the smallest integer &gt;0 such that p(2n+1,x)-k has only one real root for any k &gt;=a(n).
 * @author Sean A. Irvine
 */
public class A077155 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mP = Polynomial.create(1, 1);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mP = RING.multiply(mP, Polynomial.create(2 * mN, 1));
    mP = RING.multiply(mP, Polynomial.create(2 * mN + 1, 1));
    final Polynomial<Z> d = RING.diff(mP);
    CR max = CR.ZERO;
    for (long k = 1; k < 2L * mN + 1; ++k) {
      final CR x = new ZPolynomialFunction(d).inverseMonotone(CR.valueOf(-k - 1), CR.valueOf(-k)).execute(CR.ZERO);
      final CR v = PolynomialUtils.eval(ComputableReals.SINGLETON, mP, x);
      max = max.max(v);
    }
    return max.ceil();
  }
}

