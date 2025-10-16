package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a386.A386631;

/**
 * A387226 Values of w in the quartets (2, u, v, w) of type 3; i.e., values of w for solutions to 2*(2 - u) = v*(v - w), in distinct positive integers, with v &gt; 1, sorted by nondecreasing values of u; see A386631.
 * @author Sean A. Irvine
 */
public class A387226 extends A386631 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
