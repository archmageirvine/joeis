package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022921 Number of integers m such that 3^n &lt; 2^m &lt; 3^(n+1).
 * @author Sean A. Irvine
 */
public class A022921 extends Sequence0 {

  private static final CR LOG = CR.THREE.log().divide(CR.TWO.log());
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR n1 = CR.valueOf(mN + 1);
    return LOG.multiply(n1).floor().subtract(LOG.multiply(n).floor());
  }
}
