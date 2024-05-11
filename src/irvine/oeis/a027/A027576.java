package irvine.oeis.a027;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027576 Numbers n such that n^2 + (n+1)^2 + (n+2)^2 + (n+3)^2 is palindromic.
 * @author Sean A. Irvine
 */
public class A027576 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.square().add(mN.add(1).square()).add(mN.add(2).square()).add(mN.add(3).square()))) {
        return mN;
      }
    }
  }
}
