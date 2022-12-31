package irvine.oeis.a200;

import irvine.math.z.Z;
import irvine.oeis.a062.A062739;

/**
 * A200049 Positions of squares of odd primes among odd powerful numbers A062739.
 * @author Georg Fischer
 */
public class A200049 extends A062739 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z term = super.next();
      if (term.isSquare()) {
        if (term.sqrt().isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
