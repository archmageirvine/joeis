package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049439 Numbers n such that the number of odd divisors of n is an odd divisor of n.
 * @author Sean A. Irvine
 */
public class A049439 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      for (final Z d : Cheetah.factor(++mN).divisors()) {
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
