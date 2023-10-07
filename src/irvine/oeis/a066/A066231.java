package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066231 Numbers n such that phi(n) = phi(n-1) - phi(n-2).
 * @author Sean A. Irvine
 */
public class A066231 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(++mN).equals(Euler.phi(mN - 1).subtract(Euler.phi(mN - 2)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
