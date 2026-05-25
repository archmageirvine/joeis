package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A084981 Numbers all of whose proper divisors are palindromic.
 * @author Sean A. Irvine
 */
public class A084981 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084981() {
    super(1, k -> {
      final Z zk = Z.valueOf(k);
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (!d.equals(zk) && !Predicates.PALINDROME.is(d)) {
          return false;
        }
      }
      return true;
    });
  }
}
