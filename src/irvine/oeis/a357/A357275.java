package irvine.oeis.a357;

import irvine.math.z.Z;

/**
 * A357275 Smallest side of integer-sided primitive triangles whose angles satisfy A &lt; B &lt; C = 2*Pi/3.
 * @author Georg Fischer
 */
public class A357275 extends A357274 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
