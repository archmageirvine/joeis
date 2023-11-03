package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066692 Odd n such that tau(n) = tau(n+2), where tau(n) = A000005(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A066692 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z s1 = Jaguar.factor(mN).sigma0();
      final Z s2 = Jaguar.factor(mN + 2).sigma0();
      if (s1.equals(s2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
