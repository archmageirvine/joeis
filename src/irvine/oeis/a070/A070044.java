package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070044 Numbers k such that ceiling(k^1.5) is prime.
 * @author Sean A. Irvine
 */
public class A070044 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.CEIL_SQRT.z(mN.pow(3)).isProbablePrime()) {
        return mN;
      }
    }
  }
}
