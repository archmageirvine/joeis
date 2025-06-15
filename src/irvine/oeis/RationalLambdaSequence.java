package irvine.oeis;

import java.util.function.Function;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * This class builds an infinite sequence from a lambda expression.
 * It can be used for sequences involving simple formulas with
 * <code>binomial(n, k), factorial(n), fibonacci(n)</code> and so on.
 * Other sequence classes cannot be used in the lambda expression.
 * For formulas involving other sequences and coefficients with polynomials in n
 * see <code>SumSequence</code>.
 *
 * The index variable <code>n</code> is always starting at <code>offset</code>.
 * @author Georg Fischer
 */
public class RationalLambdaSequence extends AbstractSequence implements DirectSequence, RationalSequence {

  protected static final int NUM = 0; // indicates that the numerator should be returned.
  protected static final int DEN = 4; // indicates that the denominator should be returned.
  private int mN; // current index
  private int mNumDen; // either NUM or DEN
  protected final Function<Integer, Q> mLambda; // lambda expression n -> f(n)
  // protected DirectSequence mAssociate; // the associated sequence

  /**
   * Construct the sequence with offset, an indicator whether the numerator or the denominator should be retuernd, and a lambda expression.
   * @param offset first index.
   * @param numDen indicates whether the numerator or the denominator should be returned.
   * @param lambda lambda expression returning a rational
   */
  public RationalLambdaSequence(final int offset, final int numDen, final Function<Integer, Q> lambda) {
    super(offset);
    mN = offset - 1;
    mLambda = lambda;
    mNumDen = numDen;
  }

  /**
   * Construct the numerator sequence with offset and lambda expression.
   * @param offset first index.
   * @param lambda lambda expression returning a rational
   */
  public RationalLambdaSequence(final int offset, final Function<Integer, Q> lambda) {
    this(offset, NUM, lambda);
  }

  /**
   * Declare that the sequence returns the denominator.
   */
  protected void setNumerator() {
    mNumDen = NUM;
  }

  /**
   * Declare that the sequence returns the numerator.
   */
  protected void setDenominator() {
    mNumDen = DEN;
  }

  @Override
  public Q nextQ() {
    ++mN;
    return mLambda.apply(mN);
  }

  @Override
  public Z next() {
    ++mN;
    return mNumDen == NUM ? mLambda.apply(mN).num() : mLambda.apply(mN).den();
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return mNumDen == NUM ? mLambda.apply(n).num() : mLambda.apply(n).den();
  }
}
