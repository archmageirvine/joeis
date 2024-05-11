package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029998 Numbers k such that k^2 is palindromic in base 13.
 * @author Sean A. Irvine
 */
public class A029998 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(13, mN.square())) {
        return mN;
      }
    }
  }
}
