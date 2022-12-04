package irvine.oeis.a335;

import irvine.math.z.Z;

/**
 * A335894 Smallest side of integer-sided primitive triangles whose angles A &lt; B &lt; C are in arithmetic order.
 * @author Georg Fischer
 */
public class A335894 extends A335893 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
