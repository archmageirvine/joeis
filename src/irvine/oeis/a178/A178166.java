package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A178166 10^a(n) Pascal triangle, where a(n) = A007318(n).
 *
 * @author Georg Fischer
 */
public class A178166 extends Triangle {

  @Override
  public Z next() {
    return Z.TEN.pow(super.next());
  }
}
