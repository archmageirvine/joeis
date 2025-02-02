package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A074886 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Functions.SIGMA1.z(++mN);
      if (Functions.SIGMA1.z(sigma.subtract(mN)).equals(Functions.PHI.z(sigma.add(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
