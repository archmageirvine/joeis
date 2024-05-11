package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029737 Numbers whose square is palindromic in base 12.
 * @author Sean A. Irvine
 */
public class A029737 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(12, mN.square())) {
        return mN;
      }
    }
  }
}
