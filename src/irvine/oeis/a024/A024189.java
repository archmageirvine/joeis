package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024189 a(n) = ((n+3)!/2)*Sum_{k=1..n} (-1)^(k+1)/(k+3).
 * @author Sean A. Irvine
 */
public class A024189 extends Sequence1 {

  private Z mF = Z.THREE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN + 3);
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 1, mF.divide(k + 3));
    }
    return sum;
  }
}
