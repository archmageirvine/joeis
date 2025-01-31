package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074827 Numbers n such that tau(n) &gt; tau(n+1) where tau(x) = A000005(x).
 * @author Sean A. Irvine
 */
public class A074827 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).compareTo(Functions.SIGMA0.z(mN + 1)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
