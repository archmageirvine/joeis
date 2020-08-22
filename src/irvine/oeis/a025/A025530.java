package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025530 a(n) = (1/1 - 1/2 + ... + (-1)^(n-1)/n)*lcm{1..n}.
 * @author Sean A. Irvine
 */
public class A025530 implements Sequence {

  private long mN = 0;
  private Z mL = Z.ONE;

  @Override
  public Z next() {
    mL = mL.lcm(Z.valueOf(++mN));
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 1, mL.divide(k));
    }
    return sum;
  }
}
