package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a022.A022544;

/**
 * A046712 From the Bruck-Ryser theorem: n == 1 or 2 (mod 4) which are not the sum of 2 squares.
 * @author Sean A. Irvine
 */
public class A046712 extends A022544 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final long r = a.mod(4);
      if (r == 1 || r == 2) {
        return a;
      }
    }
  }
}
