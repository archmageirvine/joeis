package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065966 Numbers k such that phi(k) / 2 is prime.
 * @author Sean A. Irvine
 */
public class A065966 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).divide2().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
