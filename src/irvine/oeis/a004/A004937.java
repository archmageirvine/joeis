package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004937.
 * @author Sean A. Irvine
 */
public class A004937 implements Sequence {

  private static final CR PHI_POWER = ComputableReals.SINGLETON.pow(CR.PHI, 2);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI_POWER.multiply(CR.valueOf(++mN)).add(CR.HALF).floor(32);
  }
}
