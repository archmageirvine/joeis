package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386287 Values of w in the quartets (3, u, v, w) of type 2; i.e., values of v for solutions to 3(3 + u) =  v(v - w), in distinct positive integers, with v &gt; 1, sorted by nondecreasing values of u; see A386285.
 * @author Sean A. Irvine
 */
public class A386287 extends A386285 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
