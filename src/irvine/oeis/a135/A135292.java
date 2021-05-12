package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A135292 a(n) = 5^n * 4^(n^2).
 * @author Georg Fischer
 */
public class A135292 implements Sequence {

  protected long mBaseA; // baseA
  protected long mBaseB2; // baseB^2
  protected Z mPrevA;
  protected Z mPrevB;
  protected Z mAccelB;

  /** Construct the sequence */
  public A135292() {
    this(5, 4);
  } 
  
  /**
   * Generic constructor with parameters
   * @param baseA first number to be exponentiated
   * @param baseb second number to be exponentiated
   */
  public A135292(final int baseA, final int baseB) {
    mBaseA = baseA;
    mBaseB2 = baseB * baseB;
    mPrevA = Z.ONE;
    mPrevB = Z.ONE;
    mAccelB = Z.valueOf(baseB);
  }

  @Override
  public Z next() {
    final Z result = mPrevA.multiply(mPrevB);
    mPrevA = mPrevA.multiply(mBaseA);
    mPrevB = mPrevB.multiply(mAccelB);
    mAccelB = mAccelB.multiply(mBaseB2);
    return result;
  }
}
