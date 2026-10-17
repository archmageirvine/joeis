package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A086918 Numbers with at least three digits such that the absolute differences between successive digits forms a palindrome (when leading zeros are omitted).
 * @author Sean A. Irvine
 */
public class A086918 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A086918() {
    super(1, 100, k -> {
      long s = 0;
      long m = 1;
      long r = k % 10;
      k /= 10;
      while (k > 0) {
        s += m * Math.abs(r - k % 10);
        r = k % 10;
        k /= 10;
        m *= 10;
      }
      return Predicates.PALINDROME.is(s);
    });
  }
}
