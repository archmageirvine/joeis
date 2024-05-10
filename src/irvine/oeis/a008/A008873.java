package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008873 3x+1 sequence starting at 97.
 * @author Sean A. Irvine
 */
public class A008873 extends AbstractSequence {

  private Z mA = null;
  private final Z mStart;

  /** Construct the sequence. */
  public A008873() {
    this(0, 97);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param start starting term
   */
  public A008873(final int offset, final long start) {
    super(offset);
    mStart = Z.valueOf(start);
  }

  @Override
  public Z next() {
    mA = mA == null ? mStart : mA.isEven() ? mA.divide2() : mA.multiply(3).add(1);
    return mA;
  }
}

