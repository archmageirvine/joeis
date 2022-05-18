package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046655 Sum of the squares of divisors is also a square number.
 * @author Sean A. Irvine
 */
public class A046655 implements Sequence {

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
