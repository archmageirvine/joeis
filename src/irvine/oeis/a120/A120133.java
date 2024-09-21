package irvine.oeis.a120;

import irvine.math.z.Z;
import irvine.oeis.a072.A072294;

/**
 * A120133 Shortest side of primitive Heronian triangles, sorted on longest side(A120131), then on middle side(A120132) and finally on shortest side.
 * @author Sean A. Irvine
 */
public class A120133 extends A072294 {

  @Override
  protected Z select(final long a, final long b, final long c) {
    return Z.valueOf(c);
  }
}
