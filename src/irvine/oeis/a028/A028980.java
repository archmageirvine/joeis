package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028980 Numbers whose sum of divisors is palindromic.
 * @author Sean A. Irvine
 */
public class A028980 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(Functions.SIGMA.z(mN))) {
        return mN;
      }
    }
  }
}
