package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A238938 Powers of 2 without the digit '0' in their decimal expansion.
 * @author Georg Fischer
 */
public class A238938 extends AbstractSequence {

  private int mN;
  private final Z mBase;

  /** Construct the sequence. */
  public A238938() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset sequence offset
   * @param base sequence base
   */
  public A238938(final int offset, final int base) {
    super(offset);
    mBase = Z.valueOf(base);
    mN = -1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = mBase.pow(++mN);
      if (!result.toString().contains("0")) {
        return result;
      }
    }
  }
}
