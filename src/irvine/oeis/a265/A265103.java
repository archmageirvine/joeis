package irvine.oeis.a265;
// Generated by gen_seq4.pl holos at 2021-05-09 23:36
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A265103 a(n) = binomial(10*n + 7, 5*n + 1)/(10*n + 7).
 * @author Georg Fischer
 */
public class A265103 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A265103() {
    super(0, "[[0],[-288,-576, 32000, 64000,-320000,-640000],[144,-156,-800, 125, 1250, 625]]", "[1, 728]", 0);
  }
}
