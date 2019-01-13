package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247595.
 * @author Sean A. Irvine
 */
public class A247595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247595() {
    super(new long[] {4, -4, 4}, new long[] {1, 3, 10});
  }
}
