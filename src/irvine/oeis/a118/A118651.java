package irvine.oeis.a118;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A118651 Numbers k such that k^2 is a palindrome when written in base 17.
 * @author Georg Fischer
 */
public class A118651 extends Sequence1 {

  private Z mK = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (Predicates.PALINDROME.is(17, mK.square())) {
        return mK;
      }
    }
  }
}
