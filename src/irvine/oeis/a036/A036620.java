package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036620 Number of 5-ary rooted trees with n nodes and height at most 9.
 * @author Sean A. Irvine
 */
public class A036620 extends A036606 {

  /** Construct the sequence. */
  public A036620() {
    super(5, 10);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
