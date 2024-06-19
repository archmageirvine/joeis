package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070835 Numbers n such that phi(reverse(n)) = sigma(n).
 * @author Sean A. Irvine
 */
public class A070835 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(Functions.REVERSE.l(++mN)).equals(Functions.SIGMA1.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

