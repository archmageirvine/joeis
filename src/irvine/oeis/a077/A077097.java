package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003285;

/**
 * A077097 Quotient cycle length in continued fraction expansion of sqrt(1+n^n).
 * @author Sean A. Irvine
 */
public class A077097 extends Sequence1 {

  private final DirectSequence mA = new A003285();
  private long mN = 0;

  @Override
  public Z next() {
    return mA.a(Z.ONE.add(Z.valueOf(++mN).pow(mN)));
  }
}
