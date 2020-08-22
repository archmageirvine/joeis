package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025529 a(n) = (1/1 + 1/2 + ... + 1/n)*lcm{1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A025529 implements Sequence {

  private long mN = 0;
  private Z mL = Z.ONE;

  @Override
  public Z next() {
    mL = mL.lcm(Z.valueOf(++mN));
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(mL.divide(k));
    }
    return sum;
  }
}
