package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004942 a(n) = round(n*phi^7), where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004942 extends Sequence0 {

  private static final CR PHI_POWER = ComputableReals.SINGLETON.pow(CR.PHI, 7);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI_POWER.multiply(++mN).round();
  }
}
