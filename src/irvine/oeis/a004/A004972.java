package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004972 a(n) = ceiling(n*phi^17), where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004972 implements Sequence {

  private static final CR PHI = ComputableReals.SINGLETON.pow(CR.PHI, 17);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI.multiply(++mN).ceil();
  }
}
