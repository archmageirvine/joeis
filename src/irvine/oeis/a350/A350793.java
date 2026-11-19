package irvine.oeis.a350;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A350793 Triangle read by rows: T(n,k) is the number of digraphs on n labeled nodes with k arcs and a global source (or sink), n &gt;= 1, k = 0..(n-1)^2.
 * @author Gregory Morse
 */
public class A350793 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mEdge;
  private int mN = 1;
  private int mM = -1;
  private final MemoryFunction1<Polynomial<Z>> mRows = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      // After Andrew Howroyd's InitiallyV recurrence.
      Polynomial<Z> res = RING.multiply(RING.pow(mEdge, (n - 1L) * (n - 1)), Z.valueOf(n));
      for (int k = 1; k < n; ++k) {
        final Polynomial<Z> term = RING.multiply(get(k), RING.pow(mEdge, (n - 2L) * (n - k)));
        res = RING.subtract(res, RING.multiply(term, Binomial.binomial(n, k)));
      }
      return res;
    }
  };

  /**
   * Construct with or without counting arcs explicitly.
   * @param byArcs true for an arc enumerator, false for its value at 1
   */
  protected A350793(final boolean byArcs) {
    mEdge = byArcs ? Polynomial.create(1, 1) : Polynomial.create(2);
  }

  /** Construct the sequence. */
  public A350793() {
    this(true);
  }

  protected Polynomial<Z> row(final int n) {
    return mRows.get(n);
  }

  @Override
  public Z next() {
    if (++mM > row(mN).degree()) {
      ++mN;
      mM = 0;
    }
    return row(mN).coeff(mM);
  }
}
