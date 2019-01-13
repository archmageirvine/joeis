package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087446.
 * @author Sean A. Irvine
 */
public class A087446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087446() {
    super(new long[] {-1, 1, 1}, new long[] {1, 6, 16});
  }
}
