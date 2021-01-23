package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022925 Number of 5^m between 2^n and 2^(n+1).
 * @author Sean A. Irvine
 */
public class A022925 implements Sequence {

  private static final CR LOG = CR.TWO.log().divide(CR.FIVE.log());
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR n1 = CR.valueOf(mN + 1);
    return LOG.multiply(n1).floor().subtract(LOG.multiply(n).floor());
  }
}
