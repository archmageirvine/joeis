package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022770 Ordered sequence of distinct terms of the form floor(x^i * floor(x^j)), i,j &gt;= 0, where x = sqrt(5).
 * @author Sean A. Irvine
 */
public class A022770 extends A022765 {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(ComputableReals.SINGLETON.pow(SQRT5, CR.valueOf(p.left())).floor())
      .multiply(ComputableReals.SINGLETON.pow(SQRT5, CR.valueOf(p.right()))).floor();
  }
}
