package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247904.
 * @author Sean A. Irvine
 */
public class A247904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247904() {
    super(new long[] {2, -5, 4}, new long[] {1, 6, 21});
  }
}
