package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061797 Smallest k such that k*n has even digits and is a palindrome or becomes a palindrome when 0's are added on the left.
 * @author Sean A. Irvine
 */
public class A061797 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ONE; // Avoid extra checking later
    }
    long k = 0;
    while (true) {
      Z t = mN.multiply(++k);
      while (t.mod(10) == 0) {
        t = t.divide(10);
      }
      if ((Functions.SYNDROME.i(t) & 0b1010101010) == 0 && Predicates.PALINDROME.is(10, t)) {
        return Z.valueOf(k);
      }
    }
  }
}

