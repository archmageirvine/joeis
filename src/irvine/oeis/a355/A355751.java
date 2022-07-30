package irvine.oeis.a355;
// manually hygsolve/holos at 2022-07-30 20:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355751 Positive numbers k such that the centered cube number k^3 + (k+1)^3 is equal to the difference of two positive cubes and to A352759(n).
 * @author Georg Fischer
 */
public class A355751 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355751() {
    super(1, "[[0],[-1],[4],[-6],[4],[-1]]", "4, 121, 562, 1543", 0);
  }
}
