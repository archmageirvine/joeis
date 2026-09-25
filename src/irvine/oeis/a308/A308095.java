package irvine.oeis.a308;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A308095 a(n) is the sum of sigma (i.e., A000203) over the totatives of n.
 * @author Sean A. Irvine
 */
public class A308095 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        sum = sum.add(Functions.SIGMA1.z(k));
      }
    }
    return sum;
  }
}
