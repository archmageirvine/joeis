package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030146 Squares-of-primes in which no two adjacent digits have the same parity.
 * @author Sean A. Irvine
 */
public class A030146 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next().square();
      if (A030141.isOk(s)) {
        return s;
      }
    }
  }
}
