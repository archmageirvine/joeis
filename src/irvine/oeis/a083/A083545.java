package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083545 Numbers k such that the geometric mean of the Euler totient function of k and k+1 is an integer.
 * @author Sean A. Irvine
 */
public class A083545 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).multiply(Functions.PHI.z(mN + 1)).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

