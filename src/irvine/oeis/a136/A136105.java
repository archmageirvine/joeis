package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136105 Partial sums of <code>A051941</code>.
 * @author Sean A. Irvine
 */
public class A136105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136105() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 27, 73, 155, 285});
  }
}
