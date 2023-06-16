package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031156 a(n) = 2^A031142(n).
 * @author Sean A. Irvine
 */
public class A031156 extends A031142 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().longValueExact());
  }
}
