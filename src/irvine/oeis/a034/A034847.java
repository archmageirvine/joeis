package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034847 a(n) = 1 + 4*A034780(n).
 * @author Sean A. Irvine
 */
public class A034847 extends A034780 {

  @Override
  public Z next() {
    return super.next().multiply(4).add(1);
  }
}
