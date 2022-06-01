package irvine.oeis.a101;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A101634 Subtract 1, multiply by 1, subtract 2, multiply by 2, etc.
 * @author Georg Fischer
 */
public class A101634 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A101634() {
    super(1, "[[0, 0,-1],[0, 1],[-1]]", "6", 1);
  }
}
