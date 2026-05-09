package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084749 Numbers m such that m! + p is a prime, where p is the smallest prime &gt; m.
 * @author Sean A. Irvine
 */
public class A084749 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      final Z t = mF.add(Functions.NEXT_PRIME.l(mN));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
