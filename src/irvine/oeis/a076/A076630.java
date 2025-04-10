package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076630 a(n) is the smallest number such that product of first n terms is strictly greater than n-th power of a(n-1) starting with a(1)=1.
 * @author Sean A. Irvine
 */
public class A076630 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.pow(++mN).divide(mProd).add(1);
    mProd = mProd.multiply(mA);
    return mA;
  }
}
