package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068744.
 * @author Sean A. Irvine
 */
public class A068758 extends A068744 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068758() {
    super(1);
  }

  @Override
  public Z next() {
    return potentialFlows(11, ++mN);
  }
}
