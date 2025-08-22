package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386697 Values of v in the quartets (4, u, v, w) of type 2; i.e., values of v for solutions to 4(4 + u) =  v(v - w), in distinct positive integers, with v &gt; 1, sorted by nondecreasing values of u; see A386288.
 * @author Sean A. Irvine
 */
public class A386697 extends A386288 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
