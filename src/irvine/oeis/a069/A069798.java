package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A069798 Primes whose digit reversal is a nontrivial power.
 * @author Sean A. Irvine
 */
public class A069798 extends FilterSequence {

  /** Construct the sequence. */
  public A069798() {
    super(1, new A000040(), k -> Predicates.POWER.is(Functions.REVERSE.z(k)));
  }
}

