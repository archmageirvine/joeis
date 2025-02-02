package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074876 Numbers n such that sigma(sigma(n) - phi(n)) = phi(sigma(n) + phi(n)).
 * @author Sean A. Irvine
 */
public class A074876 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      final Z sigma = Functions.SIGMA1.z(mN);
      if (Functions.SIGMA1.z(sigma.subtract(phi)).equals(Functions.SIGMA1.z(sigma.add(phi)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
