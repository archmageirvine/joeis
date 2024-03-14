package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068744.
 * @author Sean A. Irvine
 */
public class A068755 extends A068744 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068755() {
    super(1);
  }

  @Override
  public Z next() {
    return potentialFlows(8, ++mN);
  }
}
