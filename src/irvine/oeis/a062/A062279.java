package irvine.oeis.a062;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062279 Smallest multiple k*n of n which is a palindrome or becomes a palindrome when 0's are added on the left (e.g. 10 becomes 010 which is a palindrome).
 * @author Sean A. Irvine
 */
public class A062279 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ZERO; // Avoid extra checking later
    }
    long k = 0;
    while (true) {
      Z t = mN.multiply(++k);
      final Z r = t;
      while (t.mod(10) == 0) {
        t = t.divide(10);
      }
      if (Predicates.PALINDROME.is(10, t)) {
        return r;
      }
    }
  }
}

