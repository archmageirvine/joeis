package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-07-06.ack/holos at 2025-07-06 20:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A382251 a(n) = 7*n^3 - 6*n^2.
 * @author Georg Fischer
 */
public class A382251 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A382251() {
    super(1, "[0,-1,4,-6,4,-1]", "1,32,135,352", 0, 0);
  }
}
