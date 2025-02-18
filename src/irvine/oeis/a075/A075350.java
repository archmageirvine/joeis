package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075350 1-1, 2*3-(2+3), 4*5*6-(4+5+6), 7*8*9*10-(7+8+9+10), ...
 * @author Sean A. Irvine
 */
public class A075350 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(++mM);
      sum = sum.add(mM);
    }
    return prod.subtract(sum);
  }
}
