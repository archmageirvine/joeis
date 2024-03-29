package irvine.oeis.a190;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A190162 Number of peakless Motzkin paths of length n containing no subwords of  type dh^ju (j&gt;=1), where u=(1,1), h=(1,0), and d=(1,-1) (can be easily expressed using RNA secondary structure terminology).
 * @author Georg Fischer
 */
public class A190162 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A190162() {
    super(0, "[[0],[9,-1],[-25, 3],[47,-7],[-71, 13],[62,-14],[-27, 8],[5,-6],[2, 8],[-5,-5],[2, 1]]", "1, 1, 1, 2, 4, 8, 17, 36, 77, 167", 0);
  }
}
