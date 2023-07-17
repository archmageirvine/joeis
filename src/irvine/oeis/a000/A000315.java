package irvine.oeis.a000;

import irvine.math.ReducedLatinRectangles;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000315 Number of reduced Latin squares of order n; also number of labeled loops (quasigroups with an identity element) with a fixed identity element.
 * @author Sean A. Irvine
 */
public class A000315 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000315(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000315() {
    super(1);
  }

  protected int mN = 0;

  @Override
  public Z next() {
    return new ReducedLatinRectangles(++mN, mN).count();
  }
}
