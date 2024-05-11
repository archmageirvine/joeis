package irvine.oeis.a027;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027728 Palindromes of form k^2 + k + 5.
 * @author Sean A. Irvine
 */
public class A027728 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN).add(5);
      if (Predicates.PALINDROME.is(m)) {
        return m;
      }
    }
  }
}
