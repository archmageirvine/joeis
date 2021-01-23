package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022767 Ordered sequence of distinct terms of the form floor(Pi^i * floor(Pi^j)), i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A022767 extends A022765 {

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(ComputableReals.SINGLETON.pow(CR.PI, CR.valueOf(p.left())).floor())
      .multiply(ComputableReals.SINGLETON.pow(CR.PI, CR.valueOf(p.right()))).floor();
  }
}
