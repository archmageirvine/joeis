package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A056912 Odd squarefree numbers for which the number of prime divisors is odd.
 * @author Sean A. Irvine
 */
public class A056912 extends A056911 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((Functions.OMEGA.i(t) & 1) == 1) {
        return t;
      }
    }
  }
}
