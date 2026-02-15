package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A392575 Smallest number k such that Lucas(n) + 2^k is prime, or -1 if there is no such prime.
 * @author Sean A. Irvine
 */
public class A392575 extends A000032 {

  @Override
  public Z next() {
    final Z lucas = super.next();
    if (lucas.isEven()) {
      return lucas.add(1).isProbablePrime() ? Z.ZERO : Z.NEG_ONE;
    }
    long k = 0;
    while (true) {
      if (lucas.add(Z.ONE.shiftLeft(++k)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
