package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029952 Palindromic in base 5.
 * @author Sean A. Irvine
 */
public class A029952 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(5, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
