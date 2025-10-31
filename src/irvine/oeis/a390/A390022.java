package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390022 Values of v in the quartets (3, u, v, w) of type 3; i.e., values of v for solutions to 3*(3 - u) = v*(v - w), in distinct positive integers, with v &gt; 1, sorted by nondecreasing values of u; see A390021.
 * @author Sean A. Irvine
 */
public class A390022 extends A390021 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
