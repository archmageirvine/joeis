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
public class LambdaSequence extends AbstractSequence implements DirectSequence {

  private int mN; // current index
  private int mOffset; // first index
  private final Function<Integer, Z> mLambda; // lambda expression n -> f(n)
  private final Z[] mInits; // initial terms
  private final int mInitNo; // mInits.length
  private int mIn; // index for mInits

  /**
   * Construct the sequence with default offset 0 and no initial terms.
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   */
  public LambdaSequence(final Function<Integer, Z> lambda) {
    this(0, lambda);
  }

  /**
   * Construct the sequence with offset and no initial terms.
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   */
  public LambdaSequence(final int offset, final Function<Integer, Z> lambda) {
    super(offset);
    mOffset = offset;
    mN = offset - 1;
    mLambda = lambda;
    mInitNo = 0;
    mInits = new Z[0];
    mIn = -1;
  }

  /**
   * Construct the sequence with offset and a list of initial terms.
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   * @param initTerms list of initial values for a(offset), a(offset + 1) etc.
   */
  public LambdaSequence(final int offset, final Function<Integer, Z> lambda, final long... initTerms) {
    super(offset);
    mOffset = offset;
    mN = offset - 1;
    mLambda = lambda;
    mIn = -1;
    mInits = ZUtils.toZ(initTerms);
    mInitNo = mInits.length;
  }

  /**
   * Construct the sequence with offset and a list of initial terms given as a String.
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   * @param initTerms list of initial values as a String
   */
  public LambdaSequence(final int offset, final Function<Integer, Z> lambda, final String initTerms) {
    super(offset);
    mOffset = offset;
    mN = offset - 1;
    mLambda = lambda;
    mIn = -1;
    mInits = (initTerms.isEmpty() || "[]".equals(initTerms)) ? new Z[0] : ZUtils.toZ(initTerms);
    mInitNo = mInits.length;
  }

  @Override
  public Z next() {
    ++mN;
    ++mIn;
    if (mIn < mInitNo) {
      return mInits[mIn];
    } else {
      return mLambda.apply(mN);
    }
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    if (n < mInitNo - mOffset) {
      return mInits[n - mOffset];
    } else {
      return mLambda.apply(n);
    }
  }
}
