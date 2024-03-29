package irvine.oeis.a228;
// Generated by gen_seq4.pl primpos/filtpos at 2023-09-08 22:16

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a108.A108300;

/**
 * A228916 Indices of primes in sequence A108300.
 * @author Georg Fischer
 */
public class A228916 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A228916() {
    super(1, 0, new A108300(), PRIME);
  }
}
