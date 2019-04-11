package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182260 Number of ordered triples (w,x,y) with all terms in <code>{1,</code>...,n} and 2w&lt;x+y.
 * @author Sean A. Irvine
 */
public class A182260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182260() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 3, 11, 28, 56});
  }
}
