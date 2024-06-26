package irvine.oeis.a068;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068120 Smallest prime beginning with exactly n n's.
 * @author Sean A. Irvine
 */
public class A068120 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String d = String.valueOf(++mN);
    return Puma.smallestPrimeBeginningWith(d.repeat(mN), d, true);
  }
}
