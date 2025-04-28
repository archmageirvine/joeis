package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077046.
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

