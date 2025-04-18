package irvine.oeis.a226;
// Generated by gen_seq4.pl 2025-02-20.ack/polyx at 2025-02-20 23:05

import irvine.oeis.PolynomialFieldSequence;

/**
 * A226968 Number of labeled octopi with n nodes such that each tentacle has an odd number of nodes.
 * x/(1-x^2)
 * @author Georg Fischer
 */
public class A226968 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A226968() {
    super(0, "[[0, 1],[0, 1],[1, 0,-1]]", ", 1, 1,p1,p2,/,-,/,log", 0, 1);
  }
}
