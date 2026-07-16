package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085886 Let r and s be such that r + s = n; a(n) = minimum value of phi(r) + phi(s).
 * @author Sean A. Irvine
 */
public class A085886 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z min = Z.valueOf(2L * mN);
    for (long k = 1; 2 * k <= mN; ++k) {
      min = min.min(Functions.PHI.z(k).add(Functions.PHI.z(mN - k)));
    }
    return min;
  }
}
