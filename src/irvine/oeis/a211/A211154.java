package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211154 Number of 2 X 2 matrices having all terms in {-n,...,0,..,n} and even determinant.
 * @author Georg Fischer
 */
public class A211154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211154() {                                  
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1},
      new long[] {41, 457, 1345, 4481, 8521, 18985, 30017, 54721, 78121}, 1L);
  }
}
