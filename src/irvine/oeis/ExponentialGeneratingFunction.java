package irvine.oeis;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * Computes the coefficients of an exponential generating function
 * from the expansion of the underlying formula.
 * @author Georg Fischer
 */
public abstract class ExponentialGeneratingFunction extends AbstractSequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  protected int mN; // current index
  protected int mStep; // skip step-1 zeroes
  protected Z mF; // factorial mN!

  /**
   * Empty constructor.
   */
  public ExponentialGeneratingFunction() {
    this(0, 0, 1);
  }

  /**
   * Constructor with offset.
   * @param offset index of first term in OEIS.
   */
  public ExponentialGeneratingFunction(final int offset) {
    this(offset, 0, 1);
  }

  /**
   * Constructor with offset, start and stepping.
   * @param offset index of first term in OEIS.
   * @param start 0 for even, 1 for odd terms
   * @param step increase the index by this number: 1, 2
   */
  public ExponentialGeneratingFunction(int offset, final int start, final int step) {
    super(offset);
    mStep = step;
    mN = 0;
    mF = Z.ONE;
    offset += start;
    while (--offset >= 0) {
      ++mN;
      mF = mF.multiply(mN);
    }
  }

  /**
   * Computes the polynomial whose coefficients form the sequence.
   * @param n maximum degree
   * @return polynomial
   */
  public abstract Polynomial<Q> compute(final int n);

  @Override
  public Z next() {
    final Z result = compute(mN).coeff(mN).multiply(mF).num();
    for (int i = 0; i < mStep; ++i) {
      ++mN;
      mF = mF.multiply(mN);
    }
    return result;
  }
}
