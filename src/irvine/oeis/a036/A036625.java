package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036625 Number of 6-ary rooted trees with n nodes and height at most 8.
 * @author Sean A. Irvine
 */
public class A036625 extends A036606 {

  /** Construct the sequence. */
  public A036625() {
    super(6, 9);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
