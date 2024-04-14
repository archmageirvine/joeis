package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057659 Prime numbers whose square is composed of just two different decimal digits.
 * @author Sean A. Irvine
 */
public class A057659 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Integer.bitCount(Functions.SYNDROME.i(p.square())) == 2) {
        return p;
      }
    }
  }
}
