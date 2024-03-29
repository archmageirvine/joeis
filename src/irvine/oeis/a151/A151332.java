package irvine.oeis.a151;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-30 21:33

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A151332 Number of walks within N^2 (the first quadrant of Z^2) starting and ending at (0,0) and consisting of 4 n steps taken from {(-1, -1), (-1, 1), (1, 0)}.
 * @author Georg Fischer
 */
public class A151332 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A151332() {
    super(0, "[[0],[12,-88, 192,-128],[0, 1, 3, 2]]", "1, 2", 0);
  }
}
