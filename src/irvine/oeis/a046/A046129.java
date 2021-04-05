package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.Quadruple;

/**
 * A046129 Middle side b of scalene integer Heronian triangles sorted by increasing c and b.
 * @author Sean A. Irvine
 */
public class A046129 extends A046128 {

  @Override
  protected Z select(final Quadruple<Z> quadruple) {
    return quadruple.b();
  }
}
