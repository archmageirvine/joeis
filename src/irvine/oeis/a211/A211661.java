package irvine.oeis.a211;

import java.util.function.BiFunction;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A211661 Number of iterations log_3(log_3(log_3(...(n)...))) such that the result is &lt; 1.
 * @author Georg Fischer
 */
public class A211661 extends AbstractSequence {

  private long mN;
  private final BiFunction<CR, Integer, CR> mLambda;
  private final CR mLimit;
  private final CR mTiny = CR.valueOf(0.00000000000001d);

  /** Construct the sequence. */
  public A211661() {
    this(1, (x, e) -> x.log().divide(CR.THREE.log()), 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param lambda maps (term, iteration) -> new term
   * @param limit term must be smaller than this
   */
  public A211661(final int offset, final BiFunction<CR, Integer, CR> lambda, final long limit) {
    super(offset);
    mN = offset - 1;
    mLambda = lambda;
    mLimit = CR.valueOf(limit);
  }

  @Override
  public Z next() {
    ++mN;
    int e = 0;
    CR term = CR.valueOf(mN).add(mTiny);
//  System.out.println("mN=" + mN + ", e=" + e + ", term=" + term);
    while (term.compareTo(mLimit) >= 0) {
      ++e;
      term = mLambda.apply(term, e);
//    System.out.println("             , e=" + e + ", term=" + term);
    }
    return Z.valueOf(e);
  }
}
