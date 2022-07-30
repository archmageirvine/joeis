package irvine.oeis.a097;
// manually dfinite/holos at 2022-07-30 09:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A097779 Number of Motzkin paths of length n, starting with an up step, ending with a down step and having no peaks (can be easily expressed using RNA secondary structure terminology).
 * @author Georg Fischer
 */
public class A097779 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A097779() {
    super(0, "[[0],[7,-1],[-15, 3],[1,-1],[-4, 1],[0,-3],[2, 1]]", "1, 0, 0, 1, 1, 2, 5", 0);
  }
}
