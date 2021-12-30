package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056022 Numbers k such that k^6 == 1 (mod 7^2).
 * @author Georg Fischer
 */
public class A056022 implements Sequence {

  protected Z mN;
  protected Z mMod;
  protected Z mExm1;

  /** Construct the sequence. */
  public A056022() {
    this(7, 2);
  }

  /**
   * Generic constructor with parameters
   * @param mod modulus
   * @param exp exponent
   */
  public A056022(final int mod, final int exp) {
    mMod = Z.valueOf(mod).pow(exp);
    mExm1 = Z.valueOf(mod - 1);
    mN = Z.ZERO;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.modPow(mExm1, mMod).equals(Z.ONE)) {
        return mN;
      }
    }
  }
}
