package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-06.ack/holos at 2024-10-06 22:12

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A376809 Expansion of 1/sqrt(1 - 4*x^3/(1 - x)^2).
 * 1/(1-4*x^3/(1-x)^2)^(1/2)
 * @author Georg Fischer
 */
public class A376809 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A376809() {
    super(0, "[[0],[-14,4],[9,-5],[-6,3],[3,-3],[0,1]]", "1,0,0,2,4,6", 0, 0);
  }
}
