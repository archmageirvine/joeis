package irvine.oeis.a131;

import java.util.HashMap;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A131235 Triangle read by rows: T(n,k) is number of (n-k) X k matrices, k=0..n, with nonnegative integer entries and every row and column sum &lt;= 2.
 * @author Sean A. Irvine
 */
public class A131235 extends Sequence0 {

  private static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING_X = new PolynomialRingField<>(RING_Y);

  private static final Polynomial<Polynomial<Q>> XY = RING_X.monomial(RING_Y.x(), 1);
  private static final Polynomial<Polynomial<Q>> C0 = RING_X.subtract(RING_X.one(), XY);

  private static Polynomial<Polynomial<Q>> constant(final long v) {
    return RING_X.monomial(RING_Y.monomial(new Q(v), 0), 0);
  }

  private static final Polynomial<Polynomial<Q>> NUM = RING_X.add(
    RING_X.multiply(XY, RING_X.subtract(constant(3), XY)),
      RING_X.multiply(
        RING_X.add(RING_X.x(), RING_X.monomial(RING_Y.x(), 0)),
        RING_X.subtract(constant(2), XY)
      )
  );
  private static final Polynomial<Polynomial<Q>> DEN = RING_X.multiply(C0, constant(2));

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  private final HashMap<Integer, Polynomial<Polynomial<Q>>> mGf = new HashMap<>();

  protected Z t(final int m0, final int n0) {
    final int m = Math.min(m0, n0);
    final int n = Math.max(m0, n0);
    Polynomial<Polynomial<Q>> gf = mGf.get(n);
    if (gf == null) {
      gf = RING_X.series(
        RING_X.exp(RING_X.series(NUM, DEN, n), 2 * n), // limit here unclear?
        RING_X.sqrt1m(XY, n), n);
      mGf.put(n, gf);
    }
    return gf.coeff(n).coeff(m).multiply(Functions.FACTORIAL.z(m)).multiply(Functions.FACTORIAL.z(n)).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
