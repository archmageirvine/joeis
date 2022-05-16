package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A056913 Odd squarefree numbers for which the number of prime divisors is even.
 * @author Sean A. Irvine
 */
public class A056913 extends A056911 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((Jaguar.factor(t).omega() & 1) == 0) {
        return t;
      }
    }
  }
}
