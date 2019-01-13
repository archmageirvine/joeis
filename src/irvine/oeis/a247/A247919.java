package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247919.
 * @author Sean A. Irvine
 */
public class A247919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247919() {
    super(new long[] {1, -1, 0, 0, 0}, new long[] {1, 0, 0, 0, -1});
  }
}
