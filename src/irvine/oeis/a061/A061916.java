package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061916 Obtain m by omitting trailing zeros from n; a(n) = smallest k such that k*m is a palindrome with even digits, or -1 if no such multiple exists.
 * @author Sean A. Irvine
 */
public class A061916 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ONE; // Avoid extra checking later
    }
    long k = 0;
    Z m = mN;
    while (m.mod(10) == 0) {
      m = m.divide(10);
    }
    if (m.mod(10) == 5) {
      return Z.NEG_ONE;
    }
    while (true) {
      final Z t = m.multiply(++k);
      if (Predicates.PALINDROME.is(10, t) && (Functions.SYNDROME.i(t) & 0b1010101010) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

