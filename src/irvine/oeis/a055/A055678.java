package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a033.A033950;

/**
 * A055678 Integers not congruent to 0 (mod 6) that are divisible by the number of their divisors.
 * @author Sean A. Irvine
 */
public class A055678 extends A033950 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(6) != 0) {
        return t;
      }
    }
  }
}
