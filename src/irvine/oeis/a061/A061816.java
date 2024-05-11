package irvine.oeis.a061;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061816 Obtain m by omitting trailing zeros from n (cf. A004151); a(n) = smallest multiple k*m which is a palindrome.
 * @author Sean A. Irvine
 */
public class A061816 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ZERO; // Avoid extra checking later
    }
    long k = 0;
    Z m = mN;
    while (m.mod(10) == 0) {
      m = m.divide(10);
    }
    while (true) {
      final Z t = m.multiply(++k);
      if (Predicates.PALINDROME.is(10, t)) {
        return t;
      }
    }
  }
}

