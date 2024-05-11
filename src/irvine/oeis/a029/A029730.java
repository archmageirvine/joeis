package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029730 Numbers that are palindromic in base 16.
 * @author Sean A. Irvine
 */
public class A029730 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(16, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
