package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036622 Number of 6-ary rooted trees with n nodes and height at most 5.
 * @author Sean A. Irvine
 */
public class A036622 extends A036606 {

  /** Construct the sequence. */
  public A036622() {
    super(6, 6);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
