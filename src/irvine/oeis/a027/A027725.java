package irvine.oeis.a027;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027725 Palindromes of form k^2 + k + 8.
 * @author Sean A. Irvine
 */
public class A027725 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN).add(8);
      if (Predicates.PALINDROME.is(m)) {
        return m;
      }
    }
  }
}
