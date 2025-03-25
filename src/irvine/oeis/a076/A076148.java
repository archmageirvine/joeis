package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076148 Let b(1)=x, b(2)=y, k*b(k)=(2k-1)*b(k-1) + 3(k+1)*b(k-2); then b(n)=a(n)*x+c(n)/3*y.
 * @author Sean A. Irvine
 */
public class A076148 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(3).signedAdd((mN & 1) == 1, Z.valueOf(mN + 1));
    }
    return mA;
  }
}
