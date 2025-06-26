package irvine.oeis.a210;

import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A210913 Number of transitive reflexive early confluent binary relations R on n labeled elements where |{y : xRy}| &lt;= 5 for all x.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A210913 extends AbstractSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN; // current index
  private int mCol; // column number

  /** Construct the sequence. */
  public A210913() {
    this(0, 5);
  }

  /**
   * Generic constructor with parameter.
   * @param offset first index
   * @param col column number
   */
  public A210913(final int offset, final int col) {
    super(offset);
    mCol = col;
    mN = -1;
  }

  private final MemoryFunction2<Integer, Polynomial<Q>> mT = new MemoryFunction2<>() {
    @Override
    protected Polynomial<Q> compute(final Integer k, final Integer n) {
      if (k < 0) {
        return RING.zero();
      }
      Polynomial<Q> sum = RING.zero();
      for (int m = 1; m <= k; ++m) {
        sum = RING.add(sum, RING.divide(get(k - m, n), new Q(Functions.FACTORIAL.z(m))).shift(m));
      }
      return RING.exp(sum.truncate(n), n);
    }
  };

  /** The triangle of polynomials. */
  public Polynomial<Q> t(final int k, final int n) {
    return mT.get(k, n);
  }

  @Override
  public Z next() {
    ++mN;
    return mT.get(mCol, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).num();
  }
}
