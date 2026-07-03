package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084123 Palindromic numbers which are equal to a number k multiplied by the k-th prime.
 * @author Sean A. Irvine
 */
public class A084123 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next().multiply(++mN);
      if (Predicates.PALINDROME.is(p)) {
        return p;
      }
    }
  }
}

