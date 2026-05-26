package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085044 Smallest number k such that tau(n) +tau(k) =tau(n+k), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085044 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long d = Functions.SIGMA0.l(++mN);
    long k = 0;
    while (true) {
      if (d + Functions.SIGMA0.l(++k) == Functions.SIGMA0.l(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}
