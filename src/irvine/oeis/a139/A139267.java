package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139267 Twice octagonal numbers: <code>2*n*(3*n-2)</code>.
 * @author Sean A. Irvine
 */
public class A139267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139267() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 16});
  }
}
