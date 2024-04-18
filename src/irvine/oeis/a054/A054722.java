package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A054722 Triangle of coefficients of polynomials arising in enumeration of periodic sequences.
 * @author Sean A. Irvine
 */
public class A054722 extends MemoryFunction2Sequence<Integer, Polynomial<Z>> {

  /** Construct the sequence. */
  public A054722() {
    super(1);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mQ = RING.zero();
  private int mN = 0;
  private int mM = 1;

  @Override
  protected Polynomial<Z> compute(final Integer n, final Integer m) {
    if (m == 0) {
      return RING.one();
    }
    if (m == 1) {
      final Z[] t = new Z[n + 1];
      t[0] = Z.ZERO;
      for (int k = 1; k < t.length; ++k) {
        t[k] = n % k == 0 ? Z.ONE : Z.ZERO;
      }
      return Polynomial.create(t);
    }
    return RING.add(RING.multiply(get(n, 1), get(n, m - 1)), RING.diff(get(n, m - 1)).shift(1));
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      ++mN;
      mQ = RING.zero();
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final int d = dd.intValue();
        mQ = RING.add(mQ, RING.multiply(get(d, mN / d), Functions.PHI.z(dd)));
      }
      mM = mQ.degree();
    }
    return mQ.coeff(mM).divide(mN);
  }
}

