package irvine.oeis.a090;

import irvine.math.z.Z;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A090209 extends A090210 {

  private int mN = 3;

  /** Construct the sequence. */
  public A090209() {
    super(0);
  }

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
