package irvine.oeis;

import java.util.function.Function;

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
public class LambdaSequence extends AbstractSequence implements DirectSequence {

  private int mN; // current index
  private final int mOffset; // first index
  private final Function<Integer, Z> mLambda; // lambda expression n -> f(n)

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
  }

  @Override
  public Z next() {
    ++mN;
    return mLambda.apply(mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return mLambda.apply(n);
  }
}
