package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006252 Expansion of e.g.f. 1/(1 - log(1+x)).
 * @author Sean A. Irvine
 */
public class A006252 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      sum = sum.add(f.multiply(Functions.STIRLING1.z(mN, k)));
    }
    return sum;
  }
}
