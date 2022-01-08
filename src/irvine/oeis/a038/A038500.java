package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038500 Highest power of 3 dividing n.
 * @author Georg Fischer
 */
public class A038500 implements Sequence {

  protected long mN;
  protected long mBase;

  /** Construct the sequence. */
  public A038500() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param base take the power of this parameter
   */
  public A038500(final int base) {
    mBase = base;
    mN = 0;
  }

  @Override
  public Z next() {
    long c = 1;
    long m = ++mN;
    while (m % mBase == 0) {
      c *= mBase;
      m /= mBase;
    }
    return Z.valueOf(c);
  }
}
