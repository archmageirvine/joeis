package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029958 Numbers that are palindromic in base 13.
 * @author Sean A. Irvine
 */
public class A029958 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(13, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
