package irvine.oeis.a006;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006252 Expansion of e.g.f. <code>1/(1 -</code> log(1+x)).
 * @author Sean A. Irvine
 */
public class A006252 implements Sequence {

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
      sum = sum.add(f.multiply(Stirling.firstKind(mN, k)));
    }
    return sum;
  }
}
