package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000915 Stirling numbers of first kind s(n+4, n).
 * @author Sean A. Irvine
 */
public class A000915 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000915(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000915() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.STIRLING1.z(mN + 4, mN);
  }
}

