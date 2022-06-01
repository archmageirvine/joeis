package irvine.oeis.a051;
// manually holos at 2021-08-18

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051262 10-factorial numbers.
 * @author Georg Fischer
 */
public class A051262 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051262() {
    super(0, "[[0],[0,-10]],[1]]", "1, 10", 0);
  }
}
