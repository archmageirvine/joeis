package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022882.
 * @author Sean A. Irvine
 */
public class A022882 extends A022879 {

  private static final CR N = CR.FIVE.sqrt();

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(N.multiply(CR.valueOf(p.left())).floor())
      .multiply(N.multiply(CR.valueOf(p.right()))).floor();
  }
}
