package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046655 Numbers whose sum of the squares of divisors is also a square number.
 * @author Sean A. Irvine
 */
public class A046655 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma2().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
