package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055685 Numbers k such that 2^k == -1 (mod k-1).
 * @author Georg Fischer
 */
public class A055685 extends Sequence1 {

  protected Z mK = Z.ONE;
  protected Z mBase;

  /** Construct the sequence. */
  public A055685() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param base base to use
   */
  public A055685(final int base) {
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    Z k1 = mK;
    mK = mK.add(Z.ONE);
    while (!mBase.modPow(mK, k1).subtract(k1).equals(Z.NEG_ONE)) {
      k1 = mK;
      mK = mK.add(Z.ONE);
    }
    return mK;
  }
}
