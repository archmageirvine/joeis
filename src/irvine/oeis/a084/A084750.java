package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084750 Numbers k such that k! - p is a prime, where p is the smallest prime &gt; k.
 * @author Sean A. Irvine
 */
public class A084750 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z t = mF.subtract(Functions.NEXT_PRIME.l(mN));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
