package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063831 Sum of cubes of divisors is a square.
 * @author Sean A. Irvine
 */
public class A063831 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma(3).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

