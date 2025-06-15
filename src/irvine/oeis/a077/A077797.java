package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077763.
 * @author Sean A. Irvine
 */
public class A077797 extends Sequence1 {

  private int mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.TEN.pow(++mN).subtract(1).divide(9);
      final Z u = Z.TEN.pow(mN / 2);
      for (int d = 1; d < 10; ++d) {
        for (int m = 0; m < 10; ++m) {
          if (d != m) {
            final Z candidate = t.multiply(d).add(u.multiply(m - d));
            if (Predicates.PALINDROME.is(candidate) && candidate.isProbablePrime()) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}

