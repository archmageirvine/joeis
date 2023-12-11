package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067263 Numbers k such that sigma(k+1) = 5*phi(k).
 * @author Sean A. Irvine
 */
public class A067263 extends Sequence1 {

  private long mN = 2183;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN + 1).sigma().equals(Euler.phi(mN).multiply(5))) {
        return Z.valueOf(mN);
      }
    }
  }
}

