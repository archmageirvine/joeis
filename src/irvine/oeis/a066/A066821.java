package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066808.
 * @author Sean A. Irvine
 */
public class A066821 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Euler.phi(++mN * mN - 1);
      if (phi.mod(mN - 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

