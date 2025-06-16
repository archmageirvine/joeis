package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077799 Numbers m such that a smoothly undulating palindromic prime of the form (rs*10^m-sr)/99 exists, where r and s are two distinct digits and rs and sr denote concatenations of those digits.
 * @author Sean A. Irvine
 */
public class A077799 extends Sequence1 {

  private int mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.TEN.pow(++mN);
      for (int r = 1; r < 10; ++r) {
        for (int s = 0; s < 10; ++s) {
          if (r != s) {
            final Z[] candidate = t.multiply(r * 10 + s).subtract(s * 10 + r).divideAndRemainder(99);
            if (candidate[1].isZero() && Predicates.PALINDROME.is(candidate[0]) && candidate[0].isProbablePrime()) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}

