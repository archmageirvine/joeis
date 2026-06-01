package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085045 Smallest k such that tau(n + k) = tau(n*k), or 0 if no such number exists, where tau = A000005.
 * @author Sean A. Irvine
 */
public class A085045 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.SIGMA0.l(mN * ++k) == Functions.SIGMA0.l(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}
