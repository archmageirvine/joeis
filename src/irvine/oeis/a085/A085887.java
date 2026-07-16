package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085887 Let r and s be such that r + s = n; a(n) = minimum value of tau(r) + tau(s).
 * @author Sean A. Irvine
 */
public class A085887 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z min = Functions.SIGMA0.z(mN - 1).add(1);
    for (long k = 2; 2 * k <= mN; ++k) {
      min = min.min(Functions.SIGMA0.z(k).add(Functions.SIGMA0.z(mN - k)));
    }
    return min;
  }
}
