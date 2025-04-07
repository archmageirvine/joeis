package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076496 Numbers k such that sigma(k) == 12 (mod k).
 * @author Sean A. Irvine
 */
public class A076496 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).mod(mN) == 12 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
