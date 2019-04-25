package irvine.oeis.a020;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020562 Number of cyclic multigraphs on n labeled edges (without loops).
 * @author Sean A. Irvine
 */
public class A020562 implements Sequence {

  // todo this almost works, but is fragile and doesn't go deep enough in expansions
  // todo also very slow

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(new Q(-1), Q.ONE));
  private static final CR EXP_NEG_ONE = CR.ONE.negate().exp();
  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  // todo incremental
  private Q expNegOne(final int n) {
    Q sum = Q.ZERO;
    for (int k = 2; k <= n; ++k) {
      sum = sum.add(new Q((k & 1) == 0 ? Z.ONE : Z.NEG_ONE, mF.factorial(k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    final int deg = mN + 10;
    //final Q expNegOne = expNegOne(deg);
    //final Polynomial<Q> a = RING.multiply(RING.series(RING.one(), RING.sqrt1m(RING.x(), deg), deg), expNegOne);
    final Polynomial<Q> a = RING.series(RING.one(), RING.sqrt1m(RING.x(), deg), deg);
    Polynomial<Q> b = RING.zero();
    final Polynomial<Q> log = RING.log1p(RING.negate(RING.x()), deg);
    for (int k = 0; k <= deg; ++k) {
      final Polynomial<Q> t = RING.pow(RING.subtract(RING.one(), log), k * (k - 1) / 2, deg);
      b = RING.add(b, RING.divide(t, new Q(mF.factorial(k))));
    }
    //final Polynomial<Q> e = RING.series(RING.exp(C, deg), RING.exp(RING.x(), deg), deg);
    //final Polynomial<Q> egf = RING.multiply(RING.multiply(a, b, deg), e, deg);
    final Polynomial<Q> egf = RING.multiply(a, b, deg);
    //System.out.println(egf);
    //return egf.coeff(mN).multiply(mF.factorial(mN)).toZ();
    return EXP_NEG_ONE.multiply(CR.valueOf(egf.coeff(mN).multiply(mF.factorial(mN)))).round(32);
  }
}
