package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A046328 Palindromes with exactly 2 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046328 extends FilterSequence {

  /** Construct the sequence. */
  public A046328() {
    super(1, new A002113(), Predicates.SEMIPRIME::is);
  }
}
