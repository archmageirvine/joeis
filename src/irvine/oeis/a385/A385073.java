package irvine.oeis.a385;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385073 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A385073 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (Functions.GCD.l(mN, ++k) == 1) {
        return Z.valueOf(LongUtils.modPow(k, mN - 1, mN));
      }
    }
  }
}

