package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024176 a(n) = (n+2)!(1/3 - 1/4 + ... + c/(n+2)), where c=(-1)^(n+1).
 * @author Sean A. Irvine
 */
public class A024176 implements Sequence {

  private Z mF = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN + 2);
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 1, mF.divide(k + 2));
    }
    return sum;
  }
}
