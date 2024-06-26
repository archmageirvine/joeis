package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000063 Symmetrical dissections of an n-gon.
 * @author Sean A. Irvine
 */
public class A000063 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000063(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000063() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    Z t = Functions.CATALAN.z(mN / 2 - 1);
    if ((mN & 3) == 0) {
      t = t.subtract(Functions.CATALAN.z(mN / 4 - 1));
    }
    if (mN % 6 == 0) {
      t = t.subtract(Functions.CATALAN.z(mN / 6 - 1));
    }
    return t;
  }
}

