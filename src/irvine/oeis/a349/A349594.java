package irvine.oeis.a349;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349594 Number of 2 X n mazes that can be navigated from the top left corner to the bottom right corner.
 * @author Georg Fischer
 */
public class A349594 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349594() {
    super(1, "[0,8,-16,8,-1]", "1,7,40,216", 0);
  }
}
