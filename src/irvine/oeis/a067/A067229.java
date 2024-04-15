package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067229 Numbers n such that phi(2n+1) = sigma(n).
 * @author Sean A. Irvine
 */
public class A067229 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).equals(Euler.phi(2 * mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
