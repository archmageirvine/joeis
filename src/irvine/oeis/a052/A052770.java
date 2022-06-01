package irvine.oeis.a052;
// manually 2021-09-25

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A052770 A simple grammar.
 * @author Georg Fischer
 */
public class A052770 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052770() {
    super(0, "[[0],[24,-46,-21, 74,-5,-34, 1, 6, 1],[0, 24,-70, 49, 25,-54,-30,-4],[0, 12, 19, 80, 115, 48, 6],[0,-16,-60,-70,-30,-4],[0, 6, 11, 6, 1]]", "[0, 0, 0, 0, 0, 120]", 4);
  }
}
