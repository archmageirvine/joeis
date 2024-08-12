package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a057.A057732;

/**
 * A071781 Primes p with p-2^e and p+2^e prime for some exponent e.
 * @author Sean A. Irvine
 */
public class A071781 extends A057732 {

  @Override
  public Z next() {
    while (true) {
      final long e = super.next().longValueExact();
      if (Z.ONE.shiftLeft(e + 1).add(3).isProbablePrime()) {
        return Z.ONE.shiftLeft(e).add(3);
      }
    }
  }
}
