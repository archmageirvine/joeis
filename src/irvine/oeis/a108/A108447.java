package irvine.oeis.a108;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A108447 Number of paths from (0,0) to (3n,0) that stay in the first quadrant (but may touch the horizontal axis), consisting of steps u=(2,1),U=(1,2), or d=(1,-1) and have no peaks of the form ud.
 * @author Georg Fischer
 */
public class A108447 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108447() {
    super(0, "[[0],[-420, 245,-35],[480,-388, 76],[840,-816, 192],[-60, 198,-156],[0, 8, 16]]", "1, 1, 4, 20, 113", 0);
  }
}
