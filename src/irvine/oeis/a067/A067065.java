package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067065 Numbers n such that sigma(sigma(sigma(n))) == 6*sigma(n).
 * @author Sean A. Irvine
 */
public class A067065 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Functions.SIGMA.z(++mN);
      if (Functions.SIGMA.z(Functions.SIGMA.z(sigma)).equals(sigma.multiply(6))) {
        return Z.valueOf(mN);
      }
    }
  }
}

