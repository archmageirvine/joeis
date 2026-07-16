package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085885 Let r and s be such that r + s = n; a(n) = maximum value of phi(r) + phi(s).
 * @author Sean A. Irvine
 */
public class A085885 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 1; 2 * k <= mN; ++k) {
      max = max.max(Functions.PHI.z(k).add(Functions.PHI.z(mN - k)));
    }
    return max;
  }
}
