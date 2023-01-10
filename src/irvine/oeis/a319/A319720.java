package irvine.oeis.a319;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A319720 Write n in 4-ary, sort digits into decreasing order.
 * @author Georg Fischer
 */
public class A319720 extends Sequence0 {

  private long mN;
  private final int mBase;

  /** Construct the sequence. */
  public A319720() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param base number b ase
   */
  public A319720(final int base) {
    mN = -1;
    mBase = base;
  }

  @Override
  public Z next() {
    return ZUtils.sortDigitsDescending(Z.valueOf(++mN), mBase);
  }
}
