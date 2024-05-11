package irvine.oeis.a014;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014190 Palindromes in base 3 (written in base 10).
 * @author Sean A. Irvine
 */
public class A014190 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(3, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
