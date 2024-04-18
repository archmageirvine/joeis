package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067612 Numbers n such that sigma(n) = 3*phi(sigma(n)).
 * @author Sean A. Irvine
 */
public class A067612 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z s = Functions.SIGMA.z(++mN);
      if (s.equals(Functions.PHI.z(s).multiply(3))) {
        return Z.valueOf(mN);
      }
    }
  }
}

