package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004920 Floor of n*phi^5, where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004920 extends Sequence0 {

  private static final CR PHI5 = ComputableReals.SINGLETON.pow(CR.PHI, 5);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI5.multiply(++mN).floor();
  }
}
