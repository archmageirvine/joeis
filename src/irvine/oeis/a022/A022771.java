package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022771 Ordered sequence of distinct terms of the form <code>floor(x^i * floor(x^j))</code>, i,j <code>&gt;= 0</code>, where <code>x = sqrt(7)</code>.
 * @author Sean A. Irvine
 */
public class A022771 extends A022765 {

  private static final CR SQRT7 = CR.SEVEN.sqrt();

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(ComputableReals.SINGLETON.pow(SQRT7, CR.valueOf(p.left())).floor())
      .multiply(ComputableReals.SINGLETON.pow(SQRT7, CR.valueOf(p.right()))).floor();
  }
}
