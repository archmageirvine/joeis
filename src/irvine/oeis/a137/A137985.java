package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A137985 Complementing any single bit in the binary representation of these primes produces a composite number.
 * @author Sean A. Irvine
 */
public class A137985 extends A000040 {

  {
    super.next(); // 2
    super.next(); // 3
  }

  private boolean is(final Z p) {
    for (Z a = Z.TWO; a.compareTo(p) < 0; a = a.multiply2()) {
      if (p.xor(a).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
