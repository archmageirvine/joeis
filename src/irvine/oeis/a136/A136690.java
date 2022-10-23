package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A136690 Final nonzero digit of n! in base 3.
 * Caution, works for prime bases only!
 * @author Georg Fischer
 */
public class A136690 extends Sequence0 {

  private long mN;
  private long mBase;
  private long mF;

  /** Construct the sequence. */
  public A136690() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param base
   */
  public A136690(final int base) {
    mN = -1;
    mBase = base;
    mF = 1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    mF *= mN;
    while (mF % mBase == 0) {
      mF /= mBase;
    }
    mF %= mBase;
    return Z.valueOf(mF);
  }
}
