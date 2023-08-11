package irvine.oeis.a364;
// manually robots/lingf at 2023-08-09

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A364605 Number of 6-cycles in the n-Lucas cube graph.
 * @author Georg Fischer
 */
public class A364605 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A364605() {
    super(1, "[0,-1,-4,-2,8,5,-8,-2,4,-1]", "0,0,0,0,5,44,147,464,1236", 0);
  }
}
