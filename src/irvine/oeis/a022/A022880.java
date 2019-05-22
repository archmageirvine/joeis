package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022880.
 * @author Sean A. Irvine
 */
public class A022880 extends A022879 {

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(CR.SQRT2.multiply(CR.valueOf(p.left())).floor())
      .multiply(CR.SQRT2.multiply(CR.valueOf(p.right()))).floor();
  }
}
