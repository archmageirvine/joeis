package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005774 Number of directed animals of size n (k=1 column of A038622); number of (s(0), s(1), ..., s(n)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| &lt;= 1 for i = 1,2,...,n, where s(0) = 2; also sum of row n+1 of array T in A026323.
 * @author Sean A. Irvine
 */
public class A005774 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN);
    }
    final Z t = mB.multiply(mN + 1).multiply(mN).multiply2().add(mA.multiply(mN - 1).multiply(mN).multiply(3)).divide(mN + 2).divide(mN - 1);
    mA = mB;
    mB = t;
    return mB;
  }
}
