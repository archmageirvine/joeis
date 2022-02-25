package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055685 Numbers k such that 2^k == -1 (mod k-1).
 * @author Georg Fischer
 */
public class A055685 implements Sequence {

  protected Z mK = Z.ONE;
  protected Z mBase;

  /** Construct the sequence. */
  public A055685() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param base
   */
  public A055685(final int base) {
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    Z k_1 = mK;
    mK = mK.add(Z.ONE);
    while (!mBase.modPow(mK, k_1).subtract(k_1).equals(Z.NEG_ONE)) {
      k_1 = mK;
      mK = mK.add(Z.ONE);
    }
    return mK;
  }
}
