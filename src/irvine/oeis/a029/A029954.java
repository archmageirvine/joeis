package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029954 Palindromic in base 7.
 * @author Sean A. Irvine
 */
public class A029954 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(7, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
