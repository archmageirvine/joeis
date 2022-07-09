package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036617 Number of 5-ary rooted trees with n nodes and height at most 6.
 * @author Sean A. Irvine
 */
public class A036617 extends A036606 {

  /** Construct the sequence. */
  public A036617() {
    super(5, 7);
  }

  @Override
  public Z next() {
    init();
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
