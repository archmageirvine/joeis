package irvine.oeis.a058;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a071.A071148;

/**
 * A058845 Numbers n such that the sum of the first n odd primes is palindromic.
 * @author Sean A. Irvine
 */
public class A058845 extends A071148 {

  private long mN = 0;
  {
  }

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
