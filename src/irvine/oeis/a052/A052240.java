package irvine.oeis.a052;
// manually for CC=etpadd0 2020-11-14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A052240 McKay-Thompson series of class 7B for the Monster group.
 * Uses Somos <code>T7B=4+e7B</code> with
 * <code>e7B=ecalc([1, 1;7,-1],[1, 4]) -&gt; A030181</code>
 * C.f. A034318.
 * @author Georg Fischer
 */
public class A052240 extends AbstractSequence {

  protected EulerTransform mET1; // the first sequence
  protected int mSqueeze0; // number of zeroes to be removed from the resulting sequence
  protected Z mAdd0; // add this constant to the first resulting term
  protected int mN; // current index/offset
  //protected int mOffset; // index of first term of the sequence
  protected int mState; // for zero squeezing
  protected int mCount; // for zero squeezing

  /** Construct the sequence. */
  public A052240() {
    this(-1, 1, 1, 4, -4, -4, -4, -4, -4, -4, 0);
  }

  /**
   * Constructor with parameters.
   * @param offset index of first term of the sequence
   * @param squeeze0 number of zeroes + 1 to be removed from the resulting sequence; parameter <code>in1(,sk,)</code>
   * @param factor multiply the sequence by this factor (not used)
   * @param add0 constant to be added to a(0)
   * @param per1 the terms of the PeriodicSequence to be transformed
   */
  public A052240(final int offset, final int squeeze0, final long factor, final long add0, final long... per1) {
    super(-1);
    mET1 = new EulerTransform(new PeriodicSequence(per1), 1);
    mSqueeze0 = squeeze0 - 1;
    mAdd0 = Z.valueOf(add0);
    //mOffset = offset;
    mN = offset - 1;
    mCount = mSqueeze0; // start with output
    mState = 1;
  }

  @Override
  public Z next() {
    while (true) {
      switch (mState) {
        case 0:
          if (mCount <= 0) {
            mCount = mSqueeze0;
            mState = 1;
          } else {
            --mCount;
            advance();
          }
          break;
        case 1:
          if (mCount <= 0 && mSqueeze0 > 0) {
            mCount = mSqueeze0; // now skip mSqueeze0 zeroes
            mState = 0;
          } else {
            --mCount;
            return advance();
          }
          break;
        default:
          break;
      } // switch
    } // while
  }

  private Z advance() {
    ++mN; // starts with offset (= -1)
    Z result = mET1.next();
    if (mN == 0) {
      result = result.add(mAdd0);
    }
    return result;
  }

}
