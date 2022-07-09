package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036611 Number of 4-ary rooted trees with n nodes and height at most 6.
 * @author Sean A. Irvine
 */
public class A036611 extends A036606 {

  /** Construct the sequence. */
  public A036611() {
    super(4, 7);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
