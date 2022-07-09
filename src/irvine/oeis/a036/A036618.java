package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036615 Number of 5-ary rooted trees with n nodes and height at most 4.
 * @author Sean A. Irvine
 */
public class A036618 extends A036606 {

  /** Construct the sequence. */
  public A036618() {
    super(5, 8);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
