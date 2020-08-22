package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022768 Ordered sequence of distinct terms of the form floor(x^i * floor(x^j)), where x = sqrt(2).
 * @author Sean A. Irvine
 */
public class A022768 extends A022765 {

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(ComputableReals.SINGLETON.pow(CR.SQRT2, CR.valueOf(p.left())).floor())
      .multiply(ComputableReals.SINGLETON.pow(CR.SQRT2, CR.valueOf(p.right()))).floor();
  }
}
