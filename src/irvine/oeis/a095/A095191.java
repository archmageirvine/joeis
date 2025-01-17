package irvine.oeis.a095;
// Generated by gen_seq4.pl 2024-12-04.ack/filnum at 2024-12-04 00:03

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A095191 Composites k such that k + A001414(k) is a semiprime.
 * @author Georg Fischer
 */
public class A095191 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A095191() {
    super(1, 4, k -> !Predicates.PRIME.is(k) && Predicates.SEMIPRIME.is(Functions.SOPFR.z(k).add(k)));
  }
}
