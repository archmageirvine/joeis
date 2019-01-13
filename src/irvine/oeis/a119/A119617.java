package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119617.
 * @author Sean A. Irvine
 */
public class A119617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119617() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 7, 25, 43, 79});
  }
}
