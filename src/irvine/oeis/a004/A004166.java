package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004166 Sum of digits of 3^n.
 * @author Georg Fischer
 */
public class A004166 implements Sequence {

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
    final Z result = Z.valueOf(ZUtils.digitSum(mTerm));
    mTerm = mTerm.multiply(mBase);
    return result;
  }
}
