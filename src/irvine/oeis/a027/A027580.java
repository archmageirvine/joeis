package irvine.oeis.a027;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027580 Palindromes of the form n^2 + (n+1)^2 + (n+2)^2 + (n+3)^2 + (n+4)^2.
 * @author Sean A. Irvine
 */
public class A027580 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN.add(1).square()).add(mN.add(2).square()).add(mN.add(3).square()).add(mN.add(4).square());
      if (Predicates.PALINDROME.is(m)) {
        return m;
      }
    }
  }
}
