package irvine.oeis.a120;

import irvine.math.z.Z;
import irvine.oeis.a072.A072294;

/**
 * A120131 Longest side of primitive Heronian triangles, sorted.
 * @author Sean A. Irvine
 */
public class A120131 extends A072294 {

  @Override
  protected Z select(final long a, final long b, final long c) {
    return Z.valueOf(a);
  }
}
