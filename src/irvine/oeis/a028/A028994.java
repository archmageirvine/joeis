package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028994.
 * @author Sean A. Irvine
 */
public class A028994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028994() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 52});
  }
}
