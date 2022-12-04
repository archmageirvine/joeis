package irvine.oeis.a357;

import irvine.math.z.Z;

/**
 * A357276 Middle side of integer-sided primitive triangles whose angles satisfy A &lt; B &lt; C = 2*Pi/3 = 120 degrees.
 * @author Georg Fischer
 */
public class A357276 extends A357274 {

  @Override
  public Z next() {
    super.next();
    final Z result = super.next();
    super.next();
    return result;
  }
}
