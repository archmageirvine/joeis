package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029735 Numbers k such that k^3 is palindromic in base 16.
 * @author Sean A. Irvine
 */
public class A029735 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(16, mN.pow(3))) {
        return mN;
      }
    }
  }
}
