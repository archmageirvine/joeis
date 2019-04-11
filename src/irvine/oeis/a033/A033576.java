package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033576 <code>(2*n+1)*(12*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A033576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033576() {
    super(new long[] {1, -3, 3}, new long[] {1, 39, 125});
  }
}
