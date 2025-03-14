package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-10-25.ack/holos at 2024-10-25 23:02

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A377237 Expansion of 1/sqrt(1 - 4*x/sqrt(1 - 4*x)).
 * 1/(1-4*x/(1-4*x)^(1/2))^(1/2)
 * @author Georg Fischer
 */
public class A377237 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A377237() {
    super(0, "[[0],[10336,-4608,512],[-2960,2240,-384],[-984,352],[348,-292,56],[-24,38,-14],[0,-1,1]]", "1,2,10,56,326,1936,11644", 0, 0);
  }
}
