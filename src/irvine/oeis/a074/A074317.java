package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A074317 Deficient Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A074317 extends FilterSequence {

  /** Construct the sequence. */
  public A074317() {
    super(1, new A000045().skip(2), Predicates.DEFICIENT::is);
  }
}
