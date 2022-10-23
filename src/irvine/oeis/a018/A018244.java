package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018244 A self-generating sequence: there are a(n) (k+1)'s between successive k's, where k=3.
 * @author Sean A. Irvine
 */
public class A018244 extends Sequence1 {

  private static final CR CONS = CR.valueOf(21).sqrt().add(CR.THREE).divide(CR.TWO);
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return CONS.multiply(n).floor().subtract(CONS.multiply(mN - 1).floor());
  }
}
