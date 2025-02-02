package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074887 Numbers n such that sigma(n - phi(n)) = phi(n + phi(n)).
 * @author Sean A. Irvine
 */
public class A074887 extends Sequence1 {

  private long mN = 914;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      if (Functions.SIGMA1.z(mN - phi).equals(Functions.PHI.z(phi + mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
