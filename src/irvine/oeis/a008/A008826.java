package irvine.oeis.a008;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;

/**
 * A008826 Triangle of coefficients from fractional iteration of e^x - 1.
 * @author Sean A. Irvine
 */
public class A008826 extends MemoryFunction1Sequence<Polynomial<Z>> {

  /** Construct the sequence. */
  public A008826() {
    super(2);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 1;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final int n) {
    if (n < 1) {
      return RING.zero();
    }
    if (n == 1) {
      return RING.one();
    }
    Polynomial<Z> sum = RING.zero();
    for (int k = 1; k < n; ++k) {
      sum = RING.add(sum, RING.multiply(get(k).shift(1), Stirling.secondKind(n, k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    Polynomial<Z> row = get(mN);
    if (++mM > row.degree()) {
      ++mN;
      mM = 1;
      row = get(mN);
    }
    return row.coeff(mM);
  }

}

