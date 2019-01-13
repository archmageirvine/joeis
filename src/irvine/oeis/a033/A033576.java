package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033576.
 * @author Sean A. Irvine
 */
public class A033576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033576() {
    super(new long[] {1, -3, 3}, new long[] {1, 39, 125});
  }
}
