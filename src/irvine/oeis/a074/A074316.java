package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A074316 Abundant Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A074316 extends FilterSequence {

  /** Construct the sequence. */
  public A074316() {
    super(1, new A000045().skip(), Predicates.ABUNDANT::is);
  }
}
