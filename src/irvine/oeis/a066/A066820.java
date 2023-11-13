package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066820 Integers of the form phi(n^2+1)/n.
 * @author Sean A. Irvine
 */
public class A066820 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Euler.phi(++mN * mN + 1);
      if (phi.mod(mN) == 0) {
        return phi.divide(mN);
      }
    }
  }
}

