package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071525 Numbers n such that sigma(phi(n)) = reversal(n).
 * @author Sean A. Irvine
 */
public class A071525 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(Functions.PHI.l(++mN)).equals(Functions.REVERSE.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
