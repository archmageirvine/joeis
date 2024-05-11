package irvine.oeis.a027;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027727 Palindromes of form k^2 + k + 9.
 * @author Sean A. Irvine
 */
public class A027727 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN).add(9);
      if (Predicates.PALINDROME.is(m)) {
        return m;
      }
    }
  }
}
