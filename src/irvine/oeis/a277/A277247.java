package irvine.oeis.a277;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A277247 a(n) = Sum_{k=0..floor(n/2)} binomial(n, k)^2.
 * @author Georg Fischer
 */
public class A277247 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A277247() {
    super(0, "[[0],[2560,-9344, 12288,-7584, 2240,-256],[-272, 1088,-1696, 1280,-464, 64],[-40, 186,-328, 274,-108, 16],[0, 0, 17,-34, 21,-4]]", "1, 1, 5, 10", 0);
  }
}
