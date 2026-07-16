package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085883 Let r and s be such that r + s = n; a(n) = maximum value of tau(r) + tau(s).
 * @author Sean A. Irvine
 */
public class A085883 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 1; 2 * k <= mN; ++k) {
      max = max.max(Functions.SIGMA0.z(k).add(Functions.SIGMA0.z(mN - k)));
    }
    return max;
  }
}
