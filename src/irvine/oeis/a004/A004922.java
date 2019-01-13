package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004922.
 * @author Sean A. Irvine
 */
public class A004922 implements Sequence {

  private static final CR PHI7 = ComputableReals.SINGLETON.pow(CR.PHI, 7);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI7.multiply(CR.valueOf(++mN)).floor(32);
  }
}
