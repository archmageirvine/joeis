package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000136 Number of ways of folding a strip of n labeled stamps.
 * @author Sean A. Irvine
 */
public class A000136 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000136(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000136() {
    super(1);
  }

  private final A000682 mA682 = new A000682();
  private long mN = 0;

  @Override
  public Z next() {
    return mA682.next().multiply(++mN);
  }
}

