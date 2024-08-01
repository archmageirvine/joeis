package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071617 a(n) = phi(p)^phi(p) where p = prime(n).
 * @author Sean A. Irvine
 */
public class A071617 extends A000040 {

  @Override
  public Z next() {
    final Z p1 = super.next().subtract(1);
    return p1.pow(p1);
  }
}
