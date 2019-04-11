package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007559 Triple factorial numbers <code>(3*n-2)!!!</code> with leading 1 added.
 * @author Sean A. Irvine
 */
public class A007559 implements Sequence {

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
