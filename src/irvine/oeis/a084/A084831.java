package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A084831 Numbers k such that sum of odd divisors and sum of even divisors are both palindromic.
 * @author Sean A. Irvine
 */
public class A084831 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084831() {
    super(1, k -> {
      Z even = Z.ZERO;
      Z odd = Z.ZERO;
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (d.isEven()) {
          even = even.add(d);
        } else {
          odd = odd.add(d);
        }
      }
      return Predicates.PALINDROME.is(even) && Predicates.PALINDROME.is(odd);
    });
  }
}

