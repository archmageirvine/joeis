package irvine.oeis.a195;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A195770 Positive integers a for which there is a 1-Pythagorean triple (a,b,c) satisfying a&lt;=b.
 * Cf. the definition and list of related sequences in A195770.
 * k-Pythagorean triples are defined by <code>c^2 = a^2 + b^2 + k*a*b</code>.
 * @author Georg Fischer
 */
public class A195770 implements Sequence {

  protected long mA; // the shortest leg
  protected long mA2; // mA^2
  protected long mB; // the leg in the middle
  protected long mC; // the longest leg
  protected long mLimB; // maximum value for b depending on a and k
  protected int mNum; // numerator of k
  protected int mDen; // denominator of k
  protected int mLeg; // code for the leg: 0 = a, 1 = b, 2 = c
  protected boolean mPrimitive; // whether the solution must be primitive

  /**
   * Finite automaton state for flattening of loop over b nested in loop over b.
   * <ul>
   * <li>mState = 0: increment b</li>
   * <li>mState = 1: increment a, compute limit for c, reset b</li>
   * </ul>
   */
  protected int mState; // 

  /**
   * Empty constructor
   */
  public A195770() {
    this(0, 1, 1, false);
  }

  /**
   * Constructor with k
   * @param leg code for the leg: 0 = a, 1 = b, 2 = c
   * @param kNum numerator of k
   * @param kDen denominator of k
   * @param primitive whether the solution must be primitive
   */
  public A195770(final int leg, final int kNum, final int kDen, final boolean primitive) {
    mLeg = leg;
    mNum = kNum;
    mDen = kDen;
    mPrimitive = primitive;
    mA = 0;
    mB = 0;
    mC = 0;
    mA2 = 0;
    mLimB = 0;
    mState = 0; // increment a
  }

  private static final int DEBUG = 0;

  @Override
  public Z next() {
    Z result = null;
    boolean busy = true;
    while (busy) {
      switch (mState) {
        case 0: // increment a
          ++mA;
          mA2 = mA * mA;
          mLimB = (mA2 - 1 - mA * mNum / mDen) / 2 + 1;
          if (mLimB < mA) {
            mLimB = mA + 128; // ??? guessed
          }
          mLimB = mA + 8192; // ??? guessed
          mB = mA - 1;
          mState = 1;
          break;
        case 1: // increment b
          ++mB;
          final long c2Pot = mA2 + mB * mB + (mA * mB * mNum / mDen); // potential c^2
          if (c2Pot > 0 && (mA * mB * mNum) % mDen == 0) {
            mC = LongUtils.sqrt(c2Pot); // maximum c such that c^2 <= a^2 + b^2 + k*a*b
            if (DEBUG >= 1) {
              System.out.println("a=" + mA + ", b=" + mB + ", c=" + mC + ", mLimB=" + mLimB + ", c2Pot=" + c2Pot);
            }
            if (mC * mC == c2Pot) { // c2Pot was a square 
              if (!mPrimitive || (LongUtils.gcd(mA, mB, mC) == 1)) {
                busy = false; // solution found
                // mState = 1; // next b
              }
            }
          }
          if (mB > mLimB) { // b exhausted
            mState = 0; // next a
          }
          break;
        default:
          break;
      } // switch
    } // while busy
    switch (mLeg) {
      case 0:
        result = Z.valueOf(mA);
        break;
      case 1:
        result = Z.valueOf(mB);
        break;
      case 2:
        result = Z.valueOf(mC);
        break;
      default:
        break;
    }
    return result;
  }
}
