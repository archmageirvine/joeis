package irvine.oeis.a388;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388860 Numbers k such that the number of runs of 1's in k is the same as the number of runs on 1's in k^2.
 * @author Sean A. Irvine
 */
public class A388860 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.RUNS_OF_1.l(++mN) == Functions.RUNS_OF_1.l(Z.valueOf(mN).square())) {
        return Z.valueOf(mN);
      }
    }
  }
}
