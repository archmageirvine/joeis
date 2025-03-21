package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074775 Numbers n such that tau(n) &lt; tau(n+1) where tau(x)=A000005(x).
 * @author Sean A. Irvine
 */
public class A074775 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).compareTo(Functions.SIGMA0.z(mN + 1)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
