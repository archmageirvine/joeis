package irvine.oeis.a125;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A125134 "Brazilian" numbers ("les nombres br\u00e9siliens" in French): numbers n such that there is a natural number b with 1 &lt; b &lt; n-1 such that the representation of n in base b has all equal digits.
 * @author Sean A. Irvine
 */
public class A125134 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A125134() {
    super(1, k -> {
      for (long b = 2; b < k - 1; ++b) {
        if (Predicates.REPDIGIT.is(b, k)) {
          return true;
        }
      }
      return false;
    });
  }
}
