package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004976 <code>a(n) =</code> floor(n*phi^3), where phi=(1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A004976 implements Sequence {

  private static final CR PHI = ComputableReals.SINGLETON.pow(CR.PHI, 3);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI.multiply(CR.valueOf(++mN)).floor(32);
  }
}
