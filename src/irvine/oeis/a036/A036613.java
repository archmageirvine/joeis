package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036613 Number of 4-ary rooted trees with n nodes and height at most 8.
 * @author Sean A. Irvine
 */
public class A036613 extends A036606 {

  /** Construct the sequence. */
  public A036613() {
    super(4, 9);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
