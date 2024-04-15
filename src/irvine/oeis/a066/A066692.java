package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066692 Odd numbers k such that tau(k) = tau(k+2), where tau(k) = A000005(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A066692 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z s1 = Functions.SIGMA0.z(mN);
      final Z s2 = Functions.SIGMA0.z(mN + 2);
      if (s1.equals(s2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
