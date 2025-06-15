package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077763.
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

