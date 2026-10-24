package irvine.oeis;

import java.util.function.BiFunction;

import irvine.math.z.Z;

/**
 * A sequence of minimal values of <code>k</code> such that <code>(n, k)</code> fulfill some condition.
 * @author Georg Fischer
 */
public class LeastLambdaSequence extends AbstractSequence {

  private int mN; // current index
  private int mK; // least term to be returned
  private final BiFunction<Integer, Integer, Boolean> mLambda; // which condition for k should be fulfilled
  private final BiFunction<Integer, Integer, Integer> mKappa; // how to increment mK
  /** k always restarts with 0 */
  protected static final BiFunction<Integer, Integer, Integer> ZERO = (n, k) -> 0;
  /** k always restarts with 1 */
  protected static final BiFunction<Integer, Integer, Integer> ONE = (n, k) -> 1;

  /**
   * Construct the sequence for increasing values of <code>k</code>.
   * @param offset first index.
   * @param lambda condition for the least <code>k</code> depending on <code>(n, k)</code>.
   */
  public LeastLambdaSequence(final int offset, final BiFunction<Integer, Integer, Boolean> lambda) {
    super(offset);
    mN = offset - 1;
    mLambda = lambda;
    mKappa = null;
    mK = 0;
  }

  /**
   * Construct the sequence for increasing values of <code>k</code>.
   * @param offset first index.
   * @param lambda condition for the least <code>k</code> depending on <code>(n, k)</code>.
   * @param kFirst start value for <code>k</code>.
   */
  public LeastLambdaSequence(final int offset, final BiFunction<Integer, Integer, Boolean> lambda, final int kFirst) {
    super(offset);
    mN = offset - 1;
    mLambda = lambda;
    mK = kFirst;
    mKappa = null;
  }

  /**
   * Construct the sequence for increasing values of <code>k</code>.
   * @param offset first index.
   * @param lambda condition for the least <code>k</code> depending on <code>(n, k)</code>.
   * @param kFirst start value for <code>k</code>.
   * @param kappa rule how to increment <code>k</code> depending on <code>(n, k)</code>.
   */
  public LeastLambdaSequence(final int offset, final BiFunction<Integer, Integer, Boolean> lambda, final int kFirst, final BiFunction<Integer, Integer, Integer> kappa) {
    super(offset);
    mN = offset - 1;
    mLambda = lambda;
    mK = kFirst;
    mKappa = kappa;
  }

  @Override
  public Z next() {
    ++mN;
    if (mKappa != null) {
      mK = mKappa.apply(mN, mK);
    }
    while (!mLambda.apply(mN, mK)) {
      ++mK;
    }
    return Z.valueOf(mK);
  }
}
