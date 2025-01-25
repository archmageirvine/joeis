package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074713 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.ANTISIGMA1.z(++mN).equals(Functions.PHI.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
