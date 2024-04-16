package irvine.oeis.a319;

import irvine.math.function.Functions;
import irvine.math.z.Z;
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
    final Z n = Z.valueOf(++mN);
    return Functions.DIGIT_SORT_DESCENDING.z(mBase, n);
  }
}
