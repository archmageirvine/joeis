package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018245 A self-generating sequence: there are <code>a(n) (k+1)</code>'s between successive k's, where <code>k=4</code>.
 * @author Sean A. Irvine
 */
public class A018245 implements Sequence {

  private static final CR CONS = CR.valueOf(32).sqrt().add(CR.FOUR).divide(CR.TWO);
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return CONS.multiply(n).floor().subtract(CONS.multiply(CR.valueOf(mN - 1)).floor());
  }
}
