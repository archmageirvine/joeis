package irvine.oeis.a357;

import irvine.math.z.Z;

/**
 * A357277 Largest side c of primitive triples, in nondecreasing order, for integer-sided triangles with angles A &lt; B &lt; C = 2*Pi/3 = 120 degrees.
 * @author Georg Fischer
 */
public class A357277 extends A357274 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}
