package irvine.oeis.a229;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A229549 Numbers k such that k*(sum of digits of k) is a palindrome.
 * @author Georg Fischer
 */
public class A229549 extends Sequence1 {

  private Z mK = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (Predicates.PALINDROME.is(mK.multiply(Functions.DIGIT_SUM.l(mK)))) {
        return mK;
      }
    }
  }
}
