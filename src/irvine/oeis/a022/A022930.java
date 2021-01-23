package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022930 Number of 4^m between 3^n and 3^(n+1).
 * @author Sean A. Irvine
 */
public class A022930 implements Sequence {

  private static final CR LOG = CR.THREE.log().divide(CR.FOUR.log());
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR n1 = CR.valueOf(mN + 1);
    return LOG.multiply(n1).floor().subtract(LOG.multiply(n).floor());
  }
}
