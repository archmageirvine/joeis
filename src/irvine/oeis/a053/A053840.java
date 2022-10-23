package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A053840 (Sum of digits of n written in base 5) modulo 5.
 * @author Georg Fischer
 */
public class A053840 extends Sequence0 {

  protected long mN;
  protected long mBase;
  
  /** Construct this sequence */
  public A053840() {
    this(5);
  }
  
  /**
   * Generic constructor with parameter
   * @param base sum the digits of n written in this base
   */
  public A053840(final long base) {
    mN = -1;
    mBase = base;
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(++mN, mBase) % mBase);
  }
}
