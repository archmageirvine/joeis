package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022883 The number of numbers [ [ ix ]jx ] that equal n, where i &gt;= 1, j &gt;= 1 and x=e.
 * @author Sean A. Irvine
 */
public class A022883 extends A022879 {

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(CR.E.multiply(p.left()).floor())
      .multiply(CR.E.multiply(p.right())).floor();
  }
}
