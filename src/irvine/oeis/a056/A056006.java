package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056006 Numbers n such that n | sigma(n) + 2.
 * @author Sean A. Irvine
 */
public class A056006 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).add(2).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
