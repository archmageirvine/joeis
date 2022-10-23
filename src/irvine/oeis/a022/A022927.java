package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022927 Number of 3^m between 5^n and 5^(n+1).
 * @author Sean A. Irvine
 */
public class A022927 extends Sequence0 {

  private static final CR LOG = CR.FIVE.log().divide(CR.THREE.log());
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR n1 = CR.valueOf(mN + 1);
    return LOG.multiply(n1).floor().subtract(LOG.multiply(n).floor());
  }
}
