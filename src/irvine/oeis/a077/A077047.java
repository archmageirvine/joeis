package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077047 Doubly restricted composition numbers: number of compositions of floor(n(n+2)/2) into exactly n positive integers each no more than n+1.
 * @author Sean A. Irvine
 */
public class A077047 extends A077042 {

  private int mN = -1;

  /** Construct the sequence. */
  public A077047() {
    super(0);
  }

  @Override
  public Z next() {
    return t(++mN + 1, mN);
  }
}

