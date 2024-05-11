package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028414 Palindromes of form k^2 + k + 1.
 * @author Sean A. Irvine
 */
public class A028414 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN).add(1);
      if (Predicates.PALINDROME.is(p)) {
        return p;
      }
    }
  }
}
