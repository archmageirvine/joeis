package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022929 Number of 3^m between 4^n and 4^(n+1).
 * @author Sean A. Irvine
 */
public class A022929 extends Sequence0 {

  private static final CR LOG = CR.FOUR.log().divide(CR.THREE.log());
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR n1 = CR.valueOf(mN + 1);
    return LOG.multiply(n1).floor().subtract(LOG.multiply(n).floor());
  }
}
