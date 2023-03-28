package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A051801 Product of the nonzero digits of n.
 * @author Georg Fischer
 */
public class A051801 extends Sequence0 {

  private int mN = -1;
  private final int mBase;

  /** Construct the sequence. */
  public A051801() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param base base to use
   */
  public A051801(final int base) {
    mBase = base;
  }

  @Override
  public Z next() {
    ++mN;
    return ZUtils.digitNZProduct(Z.valueOf(mN), mBase);
  }
}
