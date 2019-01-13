package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169938.
 * @author Sean A. Irvine
 */
public class A169938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169938() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 6, 42, 156});
  }
}
