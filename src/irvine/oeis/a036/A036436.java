package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036436 Numbers whose number of divisors is a square.
 * @author Sean A. Irvine
 */
public class A036436 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
