package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024189 <code>a(n) = ((n+3)!/2)*Sum_{k=1..n} (-1)^(k+1)/(k+3)</code>.
 * @author Sean A. Irvine
 */
public class A024189 implements Sequence {

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
