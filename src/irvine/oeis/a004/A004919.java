package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004919 Floor of n*phi^4, where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004919 implements Sequence {

  private static final CR PHI4 = ComputableReals.SINGLETON.pow(CR.PHI, 4);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI4.multiply(++mN).floor();
  }
}
