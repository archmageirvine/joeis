package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.Quadruple;

/**
 * A046130 Largest side c of a scalene integer Heronian triangles sorted by increasing c and b.
 * @author Sean A. Irvine
 */
public class A046130 extends A046128 {

  @Override
  protected Z select(final Quadruple<Z> quadruple) {
    return quadruple.c();
  }
}
