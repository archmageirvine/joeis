package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077213 a(1) = 2, a(n+1) is the smallest prime greater than n*a(n).
 * @author Sean A. Irvine
 */
public class A077213 extends Sequence1 {

  private long mN = -1;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = Functions.NEXT_PRIME.z(mA.multiply(mN));
    }
    return mA;
  }
}

