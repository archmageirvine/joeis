package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036610 Number of 4-ary rooted trees with n nodes and height at most 5.
 * @author Sean A. Irvine
 */
public class A036610 extends A036606 {

  /** Construct the sequence. */
  public A036610() {
    super(4, 6);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
