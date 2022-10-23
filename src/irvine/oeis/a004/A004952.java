package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004952 Nearest integer to n*phi^17, where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004952 extends Sequence0 {

  private static final CR PHI_POWER = ComputableReals.SINGLETON.pow(CR.PHI, 17);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI_POWER.multiply(++mN).round();
  }
}
