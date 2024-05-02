package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065153 Numbers for which the cototient of the totient is equal to the  totient of the cototient.
 * @author Sean A. Irvine
 */
public class A065153 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      if (phi.subtract(Functions.PHI.z(phi)).equals(Functions.PHI.z(mN - phi.longValueExact()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

