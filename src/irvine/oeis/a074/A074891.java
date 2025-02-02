package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074891 Numbers n such that sigma(n) = phi(3n).
 * @author Sean A. Irvine
 */
public class A074891 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.PHI.z(3 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
