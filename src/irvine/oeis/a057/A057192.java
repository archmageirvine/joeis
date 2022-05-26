package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057192 Least m such that 1 + prime(n)*2^m is a prime, or -1 if no such m exists.
 * @author Sean A. Irvine
 */
public class A057192 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.ZERO;
    }
    long k = 0;
    do {
      ++k;
      p = p.multiply2();
    } while (!p.add(1).isProbablePrime());
    return Z.valueOf(k);
  }
}
