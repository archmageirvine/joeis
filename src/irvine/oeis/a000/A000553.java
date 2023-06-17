package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000553 Number of labeled rooted trees of height 4 with n nodes.
 * @author Sean A. Irvine
 */
public class A000553 extends AbstractSequence {

  /* Construct the sequence. */
  public A000553() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    return A000552.s(mN, 5).subtract(A000552.s(mN, 4));
  }
}
