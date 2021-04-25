package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004164 Sum of digits of n^3.
 * @author Sean Irvine
 */
public class A004164 implements Sequence {

  protected long mN;
  protected long mExp;
  
  /** Construct this sequence */
  public A004164() {
    this(3);
  }
  
  /**
   * Generic constructor with parameter
   * @param exp sum the digits of n^exp
   */
  public A004164(final long exp) {
    mN = -1;
    mExp = exp;
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(Z.valueOf(++mN).pow(mExp)));
  }
}
