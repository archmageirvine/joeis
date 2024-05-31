package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003713 Expansion of e.g.f. log(1/(1+log(1-x))).
 * @author Sean A. Irvine
 */
public class A003713 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(f.multiply(Functions.STIRLING1.z(mN, k).abs()));
      f = f.multiply(k);
    }
    return s;
  }
}
