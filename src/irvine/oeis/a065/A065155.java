package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065155 Numbers whose cototient of totient is strictly greater than totient of cototient.
 * @author Sean A. Irvine
 */
public class A065155 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      if (phi.subtract(Functions.PHI.z(phi)).compareTo(Functions.PHI.z(mN - phi.longValueExact())) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

