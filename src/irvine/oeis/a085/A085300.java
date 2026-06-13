package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085300 a(n) is the least prime x such that when reversed it is a power of prime(n).
 * @author Sean A. Irvine
 */
public class A085300 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = p;
    while (!Functions.REVERSE.z(q).isProbablePrime()) {
      q = q.multiply(p);
    }
    return Functions.REVERSE.z(q);
  }
}
