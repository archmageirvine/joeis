package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066207.
 * @author Sean A. Irvine
 */
public class A066232 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(++mN).equals(Euler.phi(mN - 2).subtract(Euler.phi(mN - 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
