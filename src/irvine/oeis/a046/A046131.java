package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.Quadruple;

/**
 * A046131 Areas of scalene integer Heronian triangles (A046128, A046129, A046130) sorted by increasing c and b.
 * @author Sean A. Irvine
 */
public class A046131 extends A046128 {

  @Override
  protected Z select(final Quadruple<Z> quadruple) {
    return quadruple.d();
  }
}
