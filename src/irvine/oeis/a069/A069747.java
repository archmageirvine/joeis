package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A069747 Numbers n such that n and phi(n) are both palindromes.
 * @author Sean A. Irvine
 */
public class A069747 extends FilterSequence {

  /** Construct the sequence. */
  public A069747() {
    super(1, new A002113().skip(), k -> Predicates.PALINDROME.is(Functions.PHI.z(k)));
  }
}
