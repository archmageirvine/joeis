package irvine.oeis;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * This class builds an infinite sequence from a lambda expression.
 * It can be used for sequences involving simple formulas with
 * <code>binomial(n, k), factorial(n), fibonacci(n)</code> and so on.
 * a list of initial terms (starting at the offset) may be specified in the constructor.
 * Only instances of <code>DirectSequence</code> can be used in the lambda expression.
 *
 * The index variable <code>n</code> is always starting at <code>offset</code>.
 * @author Georg Fischer
 */
public class LambdaSequence extends AbstractSequence implements DirectSequence {

  private long mN; // current index
  private final Function<Long, Z> mLambda; // lambda expression n -> f(n)
  private final int mOffset; // first index
  private final Z[] mInits; // initial terms
  private final int mLimit; // limit for initial terms

  /**
   * Construct the sequence with default offset 0 and no initial terms.
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   */
  public LambdaSequence(final Function<Long, Z> lambda) {
    this(0, lambda);
  }

  /**
   * Construct the sequence with offset and no initial terms.
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   * @param initTerms comma-separated list of initial (small) integer values
   */
  public LambdaSequence(final int offset, final Function<Long, Z> lambda, final long... initTerms) {
    this(offset, lambda, ZUtils.toZ(initTerms));
  }

  /**
   * Construct the sequence with offset and no initial terms.
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   * @param initTerms comma-separated list of initial (small) integer values
   */
  public LambdaSequence(final int offset, final Function<Long, Z> lambda, final String initTerms) {
    this(offset, lambda, (initTerms.isEmpty() || "[]".equals(initTerms)) ? new Z[0] : ZUtils.toZ(initTerms));
  }

  /**
   * Construct the sequence with offset and no initial terms.
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   * @param initTerms comma-separated list of initial (small) integer values
   */
  public LambdaSequence(final int offset, final Function<Long, Z> lambda, final Z[] initTerms) {
    super(offset);
    mOffset = offset;
    mN = offset - 1;
    mLambda = lambda;
    mInits = initTerms;
    mLimit = mInits.length + offset;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final long n) {
    if (n < mLimit) {
      return mInits[(int) n - mOffset];
    }
    return mLambda.apply(n);
  }
}
