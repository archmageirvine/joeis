package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015791 a(n) is the smallest integer k such that phi(k) + n | sigma(k + n).
 * @author Sean A. Irvine
 */
public class A015791 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final long n = ++k;
      final Z phi = Functions.PHI.z(n).add(mN);
      final Z sigma = Functions.SIGMA1.z(k + mN);
      if (sigma.mod(phi).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
