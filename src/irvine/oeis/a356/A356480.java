package irvine.oeis.a356;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A356480 a(n) is the minimal number of river crossings necessary to solve the missionaries and cannibals problem for n missionaries and n cannibals where the boat capacity is the minimum necessary to allow a solution.
 * @author Georg Fischer
 */
public class A356480 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A356480() {
    super(1, "[0,-1,2,-1]", "1,5,11,9,11,9,11", 0);
  }
}
