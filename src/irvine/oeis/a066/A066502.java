package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066502 Numbers k such that 7 divides phi(k).
 * @author Sean A. Irvine
 */
public class A066502 extends Sequence1 {

  private long mN = 28;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(++mN).mod(7) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
