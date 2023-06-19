package irvine.oeis;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * This class builds an infinite sequence from a lambda expression.
 * It can be used for sequences involving simple formulas with 
 * <code>binomial(n, k), factorial(n), fibonacci(n)</code> and so on.
 * Other sequence classes cannot be used in the lambda expression.
 * For formulas involving other sequences and coefficients with polynomials in n
 * see <code>SumSequence</code>.
 *
 * The index variable <code>n</code> is always starting at <code>offset</code>.
 * If a number of initial terms is specified, the lambda expression is not evaluated 
 * for that number of terms, but the index variable is incremented.
 * That is initial terms are not prepended to the sequence, but they are used instead
 * of the lambda expression result.
 * @author Georg Fischer
 */
public class LambdaSequence extends AbstractSequence {

  private int mN; // current index
  private final Function<Integer, Z> mLambda; // lambda expression n -> f(n)
  private final Z[] mInitTerms; // initial terms
  private final int mInitNo; // number of initial terms
  private int mIn; // current index in mInitTerms

  /**
   * Construct the sequence with offset 0 and no initial terms.
   *
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   */
  public LambdaSequence(final Function<Integer, Z> lambda) {
    this(0, lambda, new Z[0]);
  }

  /**
   * Construct the sequence with offset and no initial terms.
   *
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   */
  public LambdaSequence(final int offset, final Function<Integer, Z> lambda) {
    this(offset, lambda, new Z[0]);
  }

  /**
   * Construct the sequence with offset and initial terms.
   *
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   * @param initTerms String of comma separated integers
   */
  public LambdaSequence(final int offset, final Function<Integer, Z> lambda, String initTerms) {
    this(offset, lambda, ZUtils.toZ(initTerms));
  }

  /**
   * Construct the sequence with offset and initial terms.
   *
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   * @param initTerms String of comma separated integers
   */
  public LambdaSequence(final int offset, final Function<Integer, Z> lambda, Z... initTerms) {
    super(offset);
    mN = offset - 1;
    mLambda = lambda;
    mInitTerms = initTerms;
    mInitNo = mInitTerms.length;
    mIn = -1;
  }

  @Override
  public Z next() {
    ++mN;
    ++mIn;
    return (mIn < mInitNo) ? mInitTerms[mIn] : mLambda.apply(mN);
  }
}
