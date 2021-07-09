package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060722 a(n) = 3^(n^2).
 * @author Georg Fischer
 */
public class A060722 implements Sequence {

  protected long mBase2; // base^2
  protected Z mPrev;
  protected Z mAccel;

  /** Construct the sequence. */
  public A060722() {
    this(3);
  } 
  
  /**
   * Generic constructor with parameters
   * @param base number to be exponentiated
   */
  public A060722(final int base) {
    mBase2 = base * (long) base;
    mPrev = Z.ONE;
    mAccel = Z.valueOf(base);
  }

  @Override
  public Z next() {
    final Z result = mPrev;
    mPrev = mPrev.multiply(mAccel);
    mAccel = mAccel.multiply(mBase2);
    return result;
  }
}
