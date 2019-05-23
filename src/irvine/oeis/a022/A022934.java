package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022934 Number of <code>2^m</code> between <code>e^n</code> and <code>e^(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A022934 implements Sequence {

  private static final CR LOG = CR.TWO.log().inverse();
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR n1 = CR.valueOf(mN + 1);
    return LOG.multiply(n1).floor().subtract(LOG.multiply(n).floor());
  }
}
