package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065496 Numbers n such that sigma(n) is a nontrivial power, i.e., sigma(n) = a^b where a and b are greater than 1.
 * @author Sean A. Irvine
 */
public class A065496 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).isPower() != null) {
        return Z.valueOf(mN);
      }
    }
  }
}
