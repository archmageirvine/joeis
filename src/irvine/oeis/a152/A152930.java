package irvine.oeis.a152;
// Generated by gen_seq4.pl holsig2/holos at 2023-08-09 20:27

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A152930 Number of sets (in the Hausdorff metric geometry) at each location between two sets defining a polygonal configuration consisting of k 4-gonal polygonal components chained with string components of length 2 as k varies.
 * @author Georg Fischer
 */
public class A152930 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A152930() {
    super(1, "[0,-1, 25,-1]", "7, 176", 0);
  }
}
