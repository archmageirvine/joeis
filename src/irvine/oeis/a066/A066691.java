package irvine.oeis.a066;

import irvine.math.function.Functions;
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
      final Z s1 = Functions.SIGMA0.z(mN);
      final Z s2 = Functions.SIGMA0.z(mN + 2);
      if (s1.equals(s2)) {
        return s1;
      }
    }
  }
}
