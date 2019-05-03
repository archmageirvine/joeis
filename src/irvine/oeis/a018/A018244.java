package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018244 A self-generating sequence: there are <code>a(n) (k+1)</code>'s between successive k's, where <code>k=3</code>.
 * @author Sean A. Irvine
 */
public class A018244 implements Sequence {

  private static final CR CONS = CR.valueOf(21).sqrt().add(CR.THREE).divide(CR.TWO);
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return CONS.multiply(n).floor(32).subtract(CONS.multiply(CR.valueOf(mN - 1)).floor(32));
  }
}
