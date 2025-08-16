package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a386.A386218;

/**
 * A385883 Values of v in the quartets (1, u, v, w) of type 2; i.e., values of v for solutions to (1 + u) =  v(v - w), in positive integers, with v &gt; 1, sorted by  nondecreasing values of u; see A386218.
 * @author Sean A. Irvine
 */
public class A385883 extends A386218 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
