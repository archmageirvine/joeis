package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029951 Even palindromes.
 * @author Sean A. Irvine
 */
public class A029951 extends Sequence1 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Predicates.PALINDROME.is(mN)) {
        return mN;
      }
    }
  }
}
