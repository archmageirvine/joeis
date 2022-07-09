package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036614 Number of 4-ary rooted trees with n nodes and height at most 9.
 * @author Sean A. Irvine
 */
public class A036614 extends A036606 {

  /** Construct the sequence. */
  public A036614() {
    super(4, 10);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
