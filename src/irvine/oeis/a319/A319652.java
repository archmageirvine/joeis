package irvine.oeis.a319;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A319652 Write n in 4-ary, sort digits into increasing order.
 * @author Georg Fischer
 */
public class A319652 extends Sequence0 {

  private long mN;
  private final int mBase;

  /** Construct the sequence. */
  public A319652() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param base number b ase
   */
  public A319652(final int base) {
    mN = -1;
    mBase = base;
  }

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Functions.DIGIT_SORT_ASCENDING.z(mBase, n);
  }
}
