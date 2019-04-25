package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006238 Complexity of (or spanning trees <code>in) a 3</code> X n grid.
 * @author Sean A. Irvine
 */
public class A006238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006238() {
    super(new long[] {-1, 15, -32, 15}, new long[] {1, 15, 192, 2415});
  }
}

