package irvine.oeis.a357;

import irvine.math.z.Z;

/**
 * A357278 Perimeters of primitive integer-sided triangles with angles A &lt; B &lt; C = 2*Pi/3 = 120 degrees.
 * @author Georg Fischer
 */
public class A357278 extends A357274 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}
