package irvine.oeis.a335;

import irvine.math.z.Z;

/**
 * A335897 Perimeters of primitive integer-sided triangles whose angles A &lt; B &lt; C are in arithmetic order.
 * @author Georg Fischer
 */
public class A335897 extends A335893 {

  @Override
  public Z next() {
    final Z result = super.next().add(super.next()).add(super.next());
    return result;
  }
}
