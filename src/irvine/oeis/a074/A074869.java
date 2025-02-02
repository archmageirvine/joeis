package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074869 Numbers n such that sigma(sigma(n) - phi(n)) = phi(n).
 * @author Sean A. Irvine
 */
public class A074869 extends Sequence1 {

  private long mN = 706;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      if (Functions.SIGMA1.z(Functions.SIGMA1.z(mN).subtract(phi)).equals(phi)) {
        return Z.valueOf(mN);
      }
    }
  }
}
