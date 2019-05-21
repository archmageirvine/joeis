package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022768 Ordered sequence of distinct terms of form <code>[ (x^i)[ x^j ] ]</code>, i,j <code>&gt;= 0</code>, where <code>x = sqrt(2)</code>.
 * @author Sean A. Irvine
 */
public class A022768 extends A022765 {

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(ComputableReals.SINGLETON.pow(CR.SQRT2, CR.valueOf(p.left())).floor())
      .multiply(ComputableReals.SINGLETON.pow(CR.SQRT2, CR.valueOf(p.right()))).floor();
  }
}
