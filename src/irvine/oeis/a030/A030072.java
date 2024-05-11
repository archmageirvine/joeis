package irvine.oeis.a030;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030072 Numbers k such that k^2 is palindromic in base 14.
 * @author Sean A. Irvine
 */
public class A030072 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(14, mN.square())) {
        return mN;
      }
    }
  }
}
