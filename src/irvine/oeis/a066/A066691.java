package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066691 Value of tau(2n-1) when tau(2n-1) = tau(2n+1).
 * @author Sean A. Irvine
 */
public class A066691 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z s1 = Jaguar.factor(mN).sigma0();
      final Z s2 = Jaguar.factor(mN + 2).sigma0();
      if (s1.equals(s2)) {
        return s1;
      }
    }
  }
}
