package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158555.
 * @author Sean A. Irvine
 */
public class A158555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158555() {
    super(new long[] {1, -3, 3}, new long[] {14, 210, 798});
  }
}
