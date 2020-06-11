package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022926 Number of powers of 7 between <code>2^n</code> and <code>2^(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A022926 implements Sequence {

  private static final CR LOG = CR.TWO.log().divide(CR.SEVEN.log());
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR n1 = CR.valueOf(mN + 1);
    return LOG.multiply(n1).floor().subtract(LOG.multiply(n).floor());
  }
}
