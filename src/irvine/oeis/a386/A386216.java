package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a385.A385884;

/**
 * A386216 Values of v in the quartets (2, u, v, w) of type 2; i.e., values of v for solutions to 2(2 + u) =  v(v - w), in distinct positive integers, with v &gt; 1, sorted by nondecreasing values of u; see A385884.
 * @author Sean A. Irvine
 */
public class A386216 extends A385884 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
