package irvine.oeis.a385;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385073 a(n) = b^(n-1) mod n, where b = A053669(n) is the least integer greater than 1 and coprime to n.
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

