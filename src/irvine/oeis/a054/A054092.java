package irvine.oeis.a054;

import java.util.function.BiFunction;

import irvine.math.z.Z;

/**
 * A054092 T(n,n), array T as in A054090.
 * @author Georg Fischer
 */
public class A054092 extends A054090 {

  private int mN; // row index
  private int mTri; // current index of triangle element
  private int mStop; // sequential index of relevant triangle element
  private final BiFunction<Integer, Integer, Integer> mStopFunction;

  /** Construct the sequence. */
  public A054092(final BiFunction<Integer, Integer, Integer> stopFunction) {
    mN = -1;
    mTri = 0;
    mStop = 0;
    mStopFunction = stopFunction;
  }

  /** Construct the sequence. */
  public A054092() {
    this((tri, n) -> tri + n + 1);
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (mTri < mStop) {
      ++mTri;
      result = super.next();
    }
    ++mN;
    mStop = mStopFunction.apply(mTri, mN);
    return result;
  }

}
