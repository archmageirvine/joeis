package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069654 a(1) = 1; for n &gt; 1, a(n) = smallest number &gt; a(n-1) having exactly n divisors.
 * @author Sean A. Irvine
 */
public class A069654 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      mA = mA.add(1);
      if (Functions.SIGMA0.l(mA) == mN) {
        return mA;
      }
    }
  }
}

