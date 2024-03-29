package irvine.oeis.a361;
// Generated by gen_seq4.pl holgrep/holos at 2023-05-08 18:43

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361567 Expansion of e.g.f. exp(x^2/2 * (1+x)^2).
 * @author Georg Fischer
 */
public class A361567 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361567() {
    super(0, "[[0],[-12,22,-12,2],[6,-9,3],[-1,1],[0],[-1]]", "1,0,1,6,15,60,555,3150,17745,158760", 0);
  }
}
