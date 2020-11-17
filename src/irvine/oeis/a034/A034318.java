package irvine.oeis.a034;
// manually for CC=etpsymm 2020-11-14

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.Sequence;

/**
 * A034318 McKay-Thompson series of class 13A for the Monster group with a(0) = -2.
 * Uses Somos <code>f13A=symm(e13B, 13);</code> with
 * <code>e13B = ecalc([1, 1;13,-1],[1, 2]) = ET[-2,-2,-2,-2,-2,-2,-2,-2,-2,-2,-2,-2, 0]</code> from A133099
 * The sequence here is <code>A - 7*q/A</code>.
 * @author Georg Fischer
 */
public class A034318 implements Sequence {

  protected EulerTransform mET1; // the first sequenc
  protected EulerTransform mET2; // the second sequence
  protected int mSqueeze0; // number of zeroes to be removed from the resulting sequence
  protected Z mFactor; // multiply the second sequence by this factor before addition
  protected Z mAdd0; // add this constant to the first resulting term
  protected int mN; // current index/offset
  protected int mOffset; // index of first term of the sequence
  protected int mState; // for zero squeezing
  protected int mCount; // for zero squeezing

  /**
   * Construct the sequence.
   */
  public A034318() {
    this(-1, 0, 13, 0, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, 0);
  }

  /**
   * Constructor with parameters.
   * @param offset index of first term of the sequence
   * @param squeeze0 number of zeroes + 1 to be removed from the resulting sequence
   * @param factor multiply the second sequence by this factor
   * @param add0 constant to be added to a(0)
   * @param per1 the terms of the PeriodicSequence to be transformed
   */
  public A034318(final int offset, final int squeeze0, final long factor, final long add0, final long... per1) {
    mET1 = new EulerTransform(new PeriodicSequence(per1), 1);
    final long[] per2 = new long[per1.length];
    for (int k = 0; k < per1.length; ++k) {
      per2[k] = -per1[k]; // negate per1
    }
    mET2 = new EulerTransform(new PeriodicSequence(per2), 1);
    mSqueeze0 = squeeze0 - 1;
    mFactor = Z.valueOf(factor);
    mAdd0 = Z.valueOf(add0);
    mOffset = -1; // offset;
    mN = mOffset - 1;
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
    final Z result;
    if (mN == mOffset) {
      result = mET1.next();
    } else if (mN == 0) {
      result = mET1.next().add(mAdd0);
    } else {
      result = mET1.next().add(mET2.next().multiply(mFactor));
    }
    return result;
  }

}
