package irvine.oeis.a060;

import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A060035 Least m &gt;= 0 such that 2^m has n 2's in its base-3 expansion.
 * @author Georg Fischer
 */
public class A060035 extends AbstractSequence {

  private int mN;
  private final int mStartM;
  private final BiFunction<Integer, Integer, Boolean> mLambda;

  /** Construct the sequence. */
  public A060035() {
    this(0, 0, (n, m) -> ZUtils.digitCounts(Z.ONE.shiftLeft(m), 3)[2] == n);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param startM first value of <code>m</code>
   * @param lambda function
   */
  public A060035(final int offset, final int startM, final BiFunction<Integer, Integer, Boolean> lambda) {
    super(0);
    mN = offset - 1;
    mStartM = startM - 1;
    mLambda = lambda;
  }

  @Override
  public Z next() {
    ++mN;
    int m = mStartM;
    while (!mLambda.apply(mN, ++m)) {
    }
    return Z.valueOf(m);
  }
}
