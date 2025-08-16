package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386630 Values of w in the quartets (1, u, v, w) of type 2; i.e., values of w for solutions to (1 + u) =  v(v - w), in positive integers, with v &gt; 1, sorted by nondecreasing values of u; see A386218.
 * @author Sean A. Irvine
 */
public class A386630 extends A386218 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
