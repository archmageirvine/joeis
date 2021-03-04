package irvine.oeis.a042;
// manually 2021-03-04

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A042974 n 1's followed by a 2.
 * @author Georg Fischer
 */
public class A042974 implements Sequence {

  private int mLen1; // length of current block of 1's
  private int mCount1; // index in current block of 1's
  private int mState; // 1 when 1's must be output, 2 for the 2

  /** Construct the sequence */
  public A042974() {
    mLen1 = 1;
    mCount1 = 0;
    mState = 1;
  }

  @Override
  public Z next() {
    Z result = Z.ONE;
    ++mCount1;
    if (mState == 1) {
      if (mCount1 >= mLen1) {
        mState = 2;
      }
    } else { // mstate == 2
      mState = 1;
      result = Z.TWO;
      ++mLen1;
      mCount1 = 0;
    }
    return result;
  }
}
