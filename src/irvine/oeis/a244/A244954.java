package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A244954 Smallest positive multiple of n whose base-3 representation contains only 0's and 1's.
 * @author Georg Fischer
 */
public class A244954 extends AbstractSequence {

  private int mN;
  private int mBase;

  /** Construct the sequence. */
  public A244954() {
    this(0, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base numer base
   */
  public A244954(final int offset, final int base) {
    super(offset);
    mN = -1;
    mBase = base;
  }

  @Override
  public Z next() {
    Z result = Z.valueOf(++mN);
    while (!result.toString(mBase).matches("[01]+")) {
      result = result.add(mN);
    }
    return result;
  }
}
