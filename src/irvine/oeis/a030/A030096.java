package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030096 Primes whose digits are all odd.
 * @author Sean A. Irvine
 */
public class A030096 extends A000040 {

  {
    super.next(); // skip 2
  }

  private boolean isAllOddDigits(long q) {
    while (q != 0) {
      if ((q & 1) == 0) {
        return false;
      }
      q /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (isAllOddDigits(p.longValueExact() / 10)) { // least digit always odd (we already handled 2)
        return p;
      }
    }
  }
}
