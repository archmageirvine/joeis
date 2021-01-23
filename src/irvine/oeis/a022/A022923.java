package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022923 Number of 2^m between 7^n and 7^(n+1).
 * @author Sean A. Irvine
 */
public class A022923 implements Sequence {

  private static final CR LOG = CR.SEVEN.log().divide(CR.TWO.log());
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR n1 = CR.valueOf(mN + 1);
    return LOG.multiply(n1).floor().subtract(LOG.multiply(n).floor());
  }
}
