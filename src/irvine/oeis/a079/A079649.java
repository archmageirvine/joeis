package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079649 Numbers k such that k! + k^2 + k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A079649 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.FACTORIAL.z(++mN).add(mN * mN + mN + 1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

