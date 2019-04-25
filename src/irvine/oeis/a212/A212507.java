package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212507 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and w&lt;2x and <code>y&lt;=2z</code>.
 * @author Sean A. Irvine
 */
public class A212507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212507() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 12, 56, 168, 399, 810});
  }
}
