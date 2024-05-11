package irvine.oeis.a058;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a262.A262044;

/**
 * A058848 Numbers k such that the sum of the first k odd composites is palindromic.
 * @author Sean A. Irvine
 */
public class A058848 extends A262044 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (Predicates.PALINDROME.is(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
