package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066499 Numbers k such that phi(k) == 2 (mod 4).
 * @author Sean A. Irvine
 */
public class A066499 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).mod(4) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
