package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007559 Triple factorial numbers (3*n-2)!!! with leading 1 added.
 * @author Sean A. Irvine
 */
public class A007559 extends AbstractSequence {

  /* Construct the sequence. */
  public A007559() {
    super(0);
  }

  private long mN = -2;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mProd = mProd.multiply(3 * mN + 1);
    }
    return mProd;
  }
}
