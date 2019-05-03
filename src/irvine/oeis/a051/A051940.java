package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051940 Truncated triangular numbers: <code>n*(n+1)/2 - 3*t*(t+1)/2</code> with <code>t=4</code>.
 * @author Sean A. Irvine
 */
public class A051940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051940() {
    super(new long[] {1, -3, 3}, new long[] {6, 15, 25});
  }
}
