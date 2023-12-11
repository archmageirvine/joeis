package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067262 Numbers k such that sigma(k+1) = 4*phi(k).
 * @author Sean A. Irvine
 */
public class A067262 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN + 1).sigma().equals(Euler.phi(mN).multiply(4))) {
        return Z.valueOf(mN);
      }
    }
  }
}

