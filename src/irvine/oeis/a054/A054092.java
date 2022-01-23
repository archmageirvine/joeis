package irvine.oeis.a054;

import java.util.function.Function;

import irvine.math.z.Z;

/**
 * A054092 T(n,n), array T as in A054090.
 * @author Georg Fischer
 */
public class A054092 extends A054090 {

  private int mN; // row index
  private int mTri; // current index of triangle element
  private int mStop; // sequential index of relevant triangle element
  private final Function<Integer, Integer> mStopFunction;

  /**
   * Construct the sequence.
   * @param firstStop index to first element of this sequence in the triangle
   * @param stopFunction function giving distance to next element of sequence
   */
  protected A054092(final int firstStop, final Function<Integer, Integer> stopFunction) {
    mStop = firstStop;
    mStopFunction = stopFunction;
    mN = -1;
    mTri = 0;
  }

  /** Construct the sequence. */
  public A054092() {
    this(0, n -> n + 1);
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (mTri < mStop) {
      ++mTri;
      result = super.next();
    }
    ++mN;
    mStop += mStopFunction.apply(mN);
    return result;
  }

}
