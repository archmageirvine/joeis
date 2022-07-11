package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036621 Number of 6-ary rooted trees with n nodes and height at most 4.
 * @author Sean A. Irvine
 */
public class A036621 extends A036606 {

  /** Construct the sequence. */
  public A036621() {
    super(6, 5);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
