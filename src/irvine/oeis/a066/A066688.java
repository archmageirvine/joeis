package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066688 Numbers n such that p(n) is congruent to n mod sigma(n), where p(n) denotes the n-th prime.
 * @author Sean A. Irvine
 */
public class A066688 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long mod = Functions.SIGMA1.l(++mN);
      if (super.next().mod(mod) == mN % mod) {
        return Z.valueOf(mN);
      }
    }
  }
}
