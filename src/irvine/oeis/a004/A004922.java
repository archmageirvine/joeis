package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004922 Floor of n*phi^7, where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004922 extends Sequence0 {

  private static final CR PHI7 = ComputableReals.SINGLETON.pow(CR.PHI, 7);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI7.multiply(++mN).floor();
  }
}
