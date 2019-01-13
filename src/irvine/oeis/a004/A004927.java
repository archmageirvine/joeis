package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004927.
 * @author Sean A. Irvine
 */
public class A004927 implements Sequence {

  private static final CR PHI_POWER = ComputableReals.SINGLETON.pow(CR.PHI, 12);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI_POWER.multiply(CR.valueOf(++mN)).floor(32);
  }
}
