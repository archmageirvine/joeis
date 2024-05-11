package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029959 Numbers that are palindromic in base 14.
 * @author Sean A. Irvine
 */
public class A029959 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(14, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
