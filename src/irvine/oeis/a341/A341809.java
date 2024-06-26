package irvine.oeis.a341;
// Generated by gen_seq4.pl 2024-04-29/ordsum at 2024-04-29 22:09

import irvine.oeis.a023.A023533;
import irvine.oeis.transform.RootSequence;

/**
 * A341809 Number of ways to write n as an ordered sum of 10 nonzero tetrahedral numbers.
 * @author Georg Fischer
 */
public class A341809 extends RootSequence {

  /** Construct the sequence. */
  public A341809() {
    super(10, new A023533().skip(2), 10, 1);
  }
}
