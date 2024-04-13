package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059795 Numbers n such that n^2 starts with the reverse of n.
 * @author Sean A. Irvine
 */
public class A059795 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 0 && Z.valueOf(mN).square().toString().startsWith(String.valueOf(Functions.REVERSE.l(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
