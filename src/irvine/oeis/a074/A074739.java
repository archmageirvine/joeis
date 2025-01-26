package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074739 Numbers n such that omega(n) &gt; log(log(n)).
 * @author Sean A. Irvine
 */
public class A074739 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      // floating-point should be good enough for the incremental range here
      if (Functions.OMEGA.i(++mN) > Math.log(Math.log(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
