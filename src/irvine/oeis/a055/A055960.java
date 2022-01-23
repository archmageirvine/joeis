package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055960 n + reversal of base 11 digits of n (written in base 10).
 * @author Georg Fischer
 */
public class A055960 implements Sequence {

  protected Z mN;
  protected int mBase;
  protected int mSign;

  /** Construct the sequence. */
  public A055960() {
    this(11, 1);
  }

  /**
   * Generic constructor with parameters
   * @param base
   * @param sign
   */
  public A055960(final int base, final int sign) {
    mBase = base;
    mSign = sign;
    mN = Z.NEG_ONE;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return mSign > 0 ? mN.add(ZUtils.reverse(mN, mBase)) : mN.subtract(ZUtils.reverse(mN, mBase));
  }
}
