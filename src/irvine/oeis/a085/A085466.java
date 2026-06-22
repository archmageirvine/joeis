package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085466 a(n) is the denominator of the polynomial in e^2 giving the (2n)-th du Bois Reymond constant.
 * @author Sean A. Irvine
 */
public class A085466 extends A085467 {

  private int mN = 0;

  /** Construct the sequence. */
  public A085466() {
    super(1);
  }

  @Override
  public Z next() {
    buildRow(++mN);
    return mLcm;
  }
}
