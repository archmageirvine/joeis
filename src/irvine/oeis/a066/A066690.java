package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066690 Odd n such that tau(n) = tau(n+2) = 10, where tau(n) = A000005(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A066690 extends Sequence1 {

  private long mN = 127249;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.SIGMA0.l(mN) == 10 && Functions.SIGMA0.l(mN + 2) == 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
