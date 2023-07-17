package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001093 a(n) = n^3 + 1.
 * @author Sean A. Irvine
 */
public class A001093 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001093(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001093() {
    super(-1);
  }

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).add(1);
  }
}

