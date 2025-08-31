package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385246 Values of w in the quartets (1, u, v, w) of type 3; i.e., values of w for solutions to 1(1 - u) = v(v - w), in distinct positive integers, with v &gt; 1, sorted by nondecreasing values of u; see A385476.
 * @author Sean A. Irvine
 */
public class A385246 extends A385476 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
