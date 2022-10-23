package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004935 Floor of n*phi^20, where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004935 extends Sequence0 {

  private static final CR PHI_POWER = ComputableReals.SINGLETON.pow(CR.PHI, 20);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI_POWER.multiply(++mN).floor();
  }
}
