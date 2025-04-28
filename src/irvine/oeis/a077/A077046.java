package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077046 Doubly restricted composition numbers: number of compositions of [n^2/2] into exactly n positive integers each strictly less than n.
 * @author Sean A. Irvine
 */
public class A077046 extends A077042 {

  private int mN = 0;

  /** Construct the sequence. */
  public A077046() {
    super(1);
  }

  @Override
  public Z next() {
    return t(mN++, mN);
  }
}

