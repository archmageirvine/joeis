package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049439 Numbers k such that the number of odd divisors of k is an odd divisor of k.
 * @author Sean A. Irvine
 */
public class A049439 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      for (final Z d : Jaguar.factor(++mN).divisors()) {
        if (d.isOdd()) {
          ++cnt;
        }
      }
      if ((cnt & 1) == 1 && mN % cnt == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
