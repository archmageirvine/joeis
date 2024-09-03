package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072121 a(1) = 1; for n &gt; 1, a(n) = smallest number &gt; a(n-1) having at least n divisors.
 * @author Sean A. Irvine
 */
public class A072121 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (true) {
      mA = mA.add(1);
      if (Functions.SIGMA0.l(mA) >= mN) {
        return mA;
      }
    }
  }
}
