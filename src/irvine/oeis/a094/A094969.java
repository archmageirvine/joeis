package irvine.oeis.a094;
// manually floor at 2021-08-30 21:01

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A094969 a(n) = floor(5^n/2^n).
 * @author Georg Fischer
 */
public class A094969 extends FloorSequence {
    
  /** Construct the sequence */
  public A094969() {
    this(0, 5, 2);
  }
  
  protected CR mNBase;
  protected CR mDBase;

  /**
   * Generic constructor with parameters
   * @param offset first value of n
   * @param nBase numerator base
   * @param dBase denominator bas
   */
  public A094969(final int offset, final int nBase, final int dBase) {
    super(offset);
    mNBase = CR.valueOf(nBase);
    mDBase = CR.valueOf(dBase);
  } 

  @Override
  protected Z evalCR(final long n) {
    return mNBase.pow(n).divide(mDBase.pow(n)).floor();
  }
}
