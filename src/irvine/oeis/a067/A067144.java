package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067081.
 * @author Sean A. Irvine
 */
public class A067144 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Euler.phi(++mN)).sigma().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
