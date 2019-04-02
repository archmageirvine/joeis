package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004967 Ceiling of n*phi^12, where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004967 implements Sequence {

  private static final CR PHI = ComputableReals.SINGLETON.pow(CR.PHI, 12);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI.multiply(CR.valueOf(++mN)).ceil(32);
  }
}
