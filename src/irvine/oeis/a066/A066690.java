package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066690 Odd k such that tau(k) = tau(k+2) = 10, where tau(k) = A000005(k) is the number of divisors of k.
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
