package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065512 Numbers n such that sigma(n) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A065512 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
