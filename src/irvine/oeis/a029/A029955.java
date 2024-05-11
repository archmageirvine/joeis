package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029955 Palindromic in base 9.
 * @author Sean A. Irvine
 */
public class A029955 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(9, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
