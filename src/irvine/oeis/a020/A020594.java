package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020594.
 * @author Sean A. Irvine
 */
public class A020594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020594() {
    super(new long[] {576, -216, 26}, new long[] {1, 26, 460});
  }
}
