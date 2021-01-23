package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022766 Ordered sequence of distinct terms of the form floor(x^i * floor(x^j)), i,j &gt;= 0, where x = e/2.
 * @author Sean A. Irvine
 */
public class A022766 extends A022765 {

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(CR.valueOf(p.left()).exp().divide(CR.valueOf(Z.ONE.shiftLeft(p.left().intValue()))).floor())
      .multiply(CR.valueOf(p.right()).exp()).divide(CR.valueOf(Z.ONE.shiftLeft(p.right().intValue()))).floor();
  }
}
