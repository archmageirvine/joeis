package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022773 Ordered sequence of distinct terms of the form <code>floor(x^i * floor(x^j))</code>, i,j <code>&gt;= 0</code>, where <code>x = log(5)</code>.
 * @author Sean A. Irvine
 */
public class A022773 extends A022765 {

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(ComputableReals.SINGLETON.pow(CR.FIVE.log(), CR.valueOf(p.left())).floor())
      .multiply(ComputableReals.SINGLETON.pow(CR.FIVE.log(), CR.valueOf(p.right()))).floor();
  }
}
