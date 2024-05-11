package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029990 Numbers k such that k^2 is palindromic in base 6.
 * @author Sean A. Irvine
 */
public class A029990 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(6, mN.square())) {
        return mN;
      }
    }
  }
}
