package irvine.oeis.a183;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A183978 1/4 the number of (n+1) X 2 binary arrays with all 2 X 2 subblock sums the same.
 * @author Georg Fischer
 */
public class A183978 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A183978() {
    super(1, "[0,4,-6,0,3,-1]", "4,6,9,15", 0);
  }
}
