package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083458 Numbers n such that n^5 + 1 is a palindrome.
 * @author Georg Fischer
 */
public class A083458 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.pow(5).add(1))) {
        return mN;
      }
    }
  }
}
