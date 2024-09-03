package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072105 Let c(1)=x, c(n+1) = c(n)/2 + n if c(n) is even, c(n+1)= 2c(n) - n otherwise; then a(n)=c(n) for c(1)=3.
 * @author Sean A. Irvine
 */
public class A072105 extends Sequence1 {

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mA == null) {
      mA = Z.THREE;
    } else if (mA.isEven()) {
      mA = mA.divide2().add(mN);
    } else {
      mA = mA.multiply2().subtract(mN);
    }
    return mA;
  }
}
