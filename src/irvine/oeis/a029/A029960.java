package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029960 Numbers that are palindromic in base 15.
 * @author Sean A. Irvine
 */
public class A029960 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(15, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
