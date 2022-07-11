package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036616 Number of 5-ary rooted trees with n nodes and height at most 5.
 * @author Sean A. Irvine
 */
public class A036616 extends A036606 {

  /** Construct the sequence. */
  public A036616() {
    super(5, 6);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
