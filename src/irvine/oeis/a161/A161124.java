package irvine.oeis.a161;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-30 21:33

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A161124 Number of inversions in all fixed-point-free involutions of {1,2,...,2n}.
 * @author Georg Fischer
 */
public class A161124 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A161124() {
    super(0, "[[0],[5,-2],[-3, 8],[-7,-2],[1]]", "0, 1, 12, 135", 0);
  }
}
