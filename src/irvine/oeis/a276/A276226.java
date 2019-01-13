package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276226.
 * @author Sean A. Irvine
 */
public class A276226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276226() {
    super(new long[] {1, 1, 2}, new long[] {0, 6, 8});
  }
}
