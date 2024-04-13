package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004166 Sum of digits of 3^n.
 * @author Georg Fischer
 */
public class A004166 extends Sequence0 {

  protected long mBase;
  protected Z mTerm;
  
  /** Construct this sequence */
  public A004166() {
    this(3);
  }
  
  /**
   * Generic constructor with parameter
   * @param base sum the digits of base^n
   */
  public A004166(final long base) {
    mBase = base;
    mTerm = Z.ONE;
  }

  @Override
  public Z next() {
    final Z result = Functions.DIGIT_SUM.z(mTerm);
    mTerm = mTerm.multiply(mBase);
    return result;
  }
}
