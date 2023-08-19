package irvine.oeis.a065;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065154 Numbers for which the cototient of the totient is strictly less than the totient of the cototient.
 * @author Sean A. Irvine
 */
public class A065154 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Euler.phi(++mN);
      if (phi.subtract(Euler.phi(phi)).compareTo(Euler.phi(mN - phi.longValueExact())) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

