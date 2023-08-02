package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A109345 a(n) = 5^((n^2 - n)/2).
 * @author Georg Fischer
 */
public class A109345 extends Sequence0 {

  private int mN = -1;
  private Z mBase;

  /** Construct the sequence. */
  public A109345() {
    this(5);
  }

  /**
   * Generic constructor with parameters
   * @param base take the power of this number
   */
  public A109345(final int base) {
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    ++mN;
    return mBase.pow(((long) mN * (mN - 1)) / 2);
  }
}
