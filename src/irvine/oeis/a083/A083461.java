package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083461 Palindromes arising in A083457.
 * @author Sean A. Irvine
 */
public class A083461 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN).subtract(1);
      if (Predicates.PALINDROME.is(t)) {
        return t;
      }
    }
  }
}
