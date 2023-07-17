package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007088 The binary numbers (or binary words, or binary vectors, or binary expansion of n): numbers written in base 2.
 * @author Sean A. Irvine
 */
public class A007088 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007088(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007088() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN));
  }
}
