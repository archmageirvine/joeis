package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066498 Numbers k such that 3 divides phi(k).
 * @author Sean A. Irvine
 */
public class A066498 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).mod(3) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
