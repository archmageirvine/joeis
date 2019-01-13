package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247526.
 * @author Sean A. Irvine
 */
public class A247526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247526() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-1, -1, 4, 14, 154});
  }
}
