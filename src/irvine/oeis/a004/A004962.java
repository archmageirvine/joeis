package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004962 a(n) = ceiling(n*phi^7), where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004962 extends Sequence0 {

  private static final CR PHI = ComputableReals.SINGLETON.pow(CR.PHI, 7);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI.multiply(++mN).ceil();
  }
}
