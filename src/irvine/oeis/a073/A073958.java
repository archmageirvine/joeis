package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A073958 Fibonacci numbers for which the number of prime factors (with multiplicity) is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A073958 extends FilterSequence {

  /** Construct the sequence. */
  public A073958() {
    super(1, new A000045().skip(2), k -> Predicates.FIBONACCI.is(Functions.BIG_OMEGA.l(k)));
  }
}

