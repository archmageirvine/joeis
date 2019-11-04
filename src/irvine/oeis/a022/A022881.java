package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A022881 The number of numbers <code>[ [</code> ix <code>]jx ]</code> that equal n, where i <code>&gt;= 1, j &gt;= 1</code> and <code>x=sqrt(3)</code>.
 * @author Sean A. Irvine
 */
public class A022881 extends A022879 {

  private static final CR N = CR.THREE.sqrt();

  @Override
  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(N.multiply(p.left()).floor())
      .multiply(N.multiply(p.right())).floor();
  }
}
