package irvine.oeis.a068;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065584.
 * @author Sean A. Irvine
 */
public class A068120 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String d = String.valueOf(++mN);
    final String s = d.repeat(mN);
    return Puma.smallestPrimeBeginningWith(s, d);
  }
}
