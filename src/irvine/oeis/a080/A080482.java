package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080482 a(n) = A080481(n)/3.
 * @author Georg Fischer
 */
public class A080482 extends A080481 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
