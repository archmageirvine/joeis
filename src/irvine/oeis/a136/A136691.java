package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A136691 Final nonzero digit of n! in base 4.
 * Works for non-prime bases, but is much slower than A136690.
 * @author Georg Fischer
 */
public class A136691 extends Sequence0 {

  private int mN;
  private final int mBase;
  private Z mF;
  private int mTrail; // number of trailing zeros

  /** Construct the sequence. */
  public A136691() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param base the base
   */
  public A136691(final int base) {
    mN = -1;
    mBase = base;
    mF = Z.ONE;
    mTrail = 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    final String str = mF.toString(mBase);
    int pos = str.length() - mTrail;
    while (str.charAt(--pos) == '0') {
      ++mTrail;
    }
    return Z.valueOf(Character.digit(str.charAt(pos), mBase));
  }
}
