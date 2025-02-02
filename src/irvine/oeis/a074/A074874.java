package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A074874 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(Functions.PHI.l(++mN) + mN).equals(Functions.SIGMA1.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
