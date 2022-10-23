package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036459 Number of iterations required to reach stationary value when repeatedly applying d, the number of divisors function (A000005).
 * @author Sean A. Irvine
 */
public class A036459 extends Sequence1 {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    Z m = mN;
    while (true) {
      final Z sigma0 = Jaguar.factor(m).sigma0();
      if (sigma0.equals(m)) {
        return Z.valueOf(cnt);
      }
      m = sigma0;
      ++cnt;
    }
  }
}

